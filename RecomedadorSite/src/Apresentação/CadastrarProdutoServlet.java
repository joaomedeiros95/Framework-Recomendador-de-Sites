package Apresentação;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import Entidades.Produto;
import Negócio.CadastrarProduto;

@WebServlet("/adicionaProduto")
public class CadastrarProdutoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private Negócio.ICadastrarObjeto iCadastrarObjeto;

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		Produto produto = new Produto(1, request.getParameter("nome"), Float.parseFloat(request.getParameter("valor")));
		iCadastrarObjeto = new CadastrarProduto();
		iCadastrarObjeto.cadastrarProduto(produto);
		
		RequestDispatcher rd = request
		        .getRequestDispatcher("sucesso/produto-cadastrado.jsp");
		rd.forward(request,response);
	}

}
