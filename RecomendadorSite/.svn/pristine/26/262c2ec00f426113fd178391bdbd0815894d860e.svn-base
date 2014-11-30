package apresentacao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import negocio.CadastrarProduto;
import excecoes.CampoInvalidoException;

@WebServlet("/adicionaProduto")
public class CadastrarProdutoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private negocio.ICadastrarObjeto iCadastrarObjeto;

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		iCadastrarObjeto = new CadastrarProduto();
		try {
			iCadastrarObjeto.cadastrarProduto(request.getParameter("nome"), request.getParameter("valor"));
		} catch (CampoInvalidoException e) {
			TratamentoExcecaoServlet.setMensagem(e.getMessage());
			RequestDispatcher rd = request
			        .getRequestDispatcher("/tratamentoExcecao");
			rd.forward(request,response);
			e.printStackTrace();
		}
		
		RequestDispatcher rd = request
		        .getRequestDispatcher("sucesso/produto-cadastrado.xhtml");
		rd.forward(request,response);
	}

}
