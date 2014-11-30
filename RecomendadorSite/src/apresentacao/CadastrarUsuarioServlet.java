package apresentacao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import negocio.CadastrarUsuario;
import excecoes.CampoInvalidoException;

@WebServlet("/adicionaUsuario")
public class CadastrarUsuarioServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private negocio.ICadastrarUsuario iCadastrarUsuario;
        
	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		iCadastrarUsuario = new CadastrarUsuario();
		try {
			iCadastrarUsuario.cadastrarUsuario(request.getParameter("nome"), 
					 request.getParameter("cpf"), 
					 request.getParameter("rg"), 
					 request.getParameter("telefone"), 
					 request.getParameter("end"), 
					 request.getParameter("obs"));
		} catch (CampoInvalidoException e) {
			TratamentoExcecaoServlet.setMensagem(e.getMessage());
			RequestDispatcher rd = request
			        .getRequestDispatcher("/tratamentoExcecao");
			rd.forward(request,response);
			e.printStackTrace();
		} catch (Exception e) {
			TratamentoExcecaoServlet.setMensagem("Aconteceu um erro inesperado, os programadores não esperavam por ele.");
			RequestDispatcher rd = request
			        .getRequestDispatcher("/tratamentoExcecao");
			rd.forward(request,response);
			e.printStackTrace();
		}
		
		RequestDispatcher rd = request
		        .getRequestDispatcher("sucesso/usuario-cadastrado.xhtml");
		rd.forward(request,response);
	}

}
