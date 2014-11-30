package apresentacao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import negocio.CadastrarVenda;
import excecoes.CampoInvalidoException;
import excecoes.NadaEncontradoException;

@WebServlet("/adicionarVenda")
public class CadastrarVendaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private CadastrarVenda cVenda = new CadastrarVenda();
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			cVenda.cadastrarVenda(request.getParameter("produto"), request.getParameter("usuario"));
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
		}
		
		RequestDispatcher rd = request
		        .getRequestDispatcher("sucesso/venda-cadastrada.xhtml");
		rd.forward(request,response);
	}
	
	
}
