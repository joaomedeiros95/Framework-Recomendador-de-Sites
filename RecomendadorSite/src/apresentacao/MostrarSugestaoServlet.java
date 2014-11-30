package apresentacao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import negocio.ServicoDeRecomendacao;
import excecoes.CampoInvalidoException;
import excecoes.NadaEncontradoException;

@WebServlet("/mostrarSugestao")
public class MostrarSugestaoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request, ServletResponse response) 
			throws ServletException ,IOException {
		
		String[] retorno = null;
		try {
			retorno = ServicoDeRecomendacao.realizar(ServicoDeRecomendacao.ALGORITMO1, request.getParameter("nome"), "");
		} catch (CampoInvalidoException e) {
			TratamentoExcecaoServlet.setMensagem(e.getMessage());
			RequestDispatcher rd = request
			        .getRequestDispatcher("/tratamentoExcecao");
			rd.forward(request,response);
			e.printStackTrace();
		} catch (NadaEncontradoException e) {
			TratamentoExcecaoServlet.setMensagem(e.getMessage());
			RequestDispatcher rd = request
			        .getRequestDispatcher("/tratamentoExcecao");
			rd.forward(request,response);
			e.printStackTrace();
		} catch(Exception e) {
			TratamentoExcecaoServlet.setMensagem("Aconteceu um erro inesperado, os programadores não esperavam por ele.");
			RequestDispatcher rd = request
			        .getRequestDispatcher("/tratamentoExcecao");
			rd.forward(request,response);
			e.printStackTrace();
		}

		request.setAttribute("sugestoes", retorno);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/mostrar-sugestao.xhtml");
		rd.forward(request,response);
	}

}
