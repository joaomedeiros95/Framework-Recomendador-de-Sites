package Apresentação;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dados.IProdutoDAO;
import Dados.IUsuarioDAO;
import Dados.IVendaDAO;
import Dados.ProdutoDAO;
import Dados.UsuarioDAO;
import Dados.VendaDAO;
import Entidades.Produto;
import Entidades.Usuario;
import Entidades.Venda;

@WebServlet("/adicionarVenda")
public class CadastrarVendaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private IVendaDAO vendaDAO;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Produto> lista = new ArrayList<Produto>();
		
		IProdutoDAO produtoDAO = ProdutoDAO.getDAO();
		Produto produto = produtoDAO.getProdutoByNome(request.getParameter("produto"));
		lista.add(produto);
		IUsuarioDAO usuarioDAO = UsuarioDAO.getDAO();
		Usuario usuario = usuarioDAO.getUsuarioByNome(request.getParameter("usuario"));
		
		Venda venda = new Venda(usuario, lista, new Date());
		vendaDAO = VendaDAO.getDAO();
		vendaDAO.addVenda(venda);
		
		RequestDispatcher rd = request
		        .getRequestDispatcher("sucesso/venda-cadastrada.jsp");
		rd.forward(request,response);
	}
	
	
}
