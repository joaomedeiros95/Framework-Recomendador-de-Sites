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
import Negócio.CadastrarProduto;
import Negócio.CadastrarUsuario;
import Negócio.CadastrarVenda;

@WebServlet("/adicionarVenda")
public class CadastrarVendaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private CadastrarProduto cProduto = new CadastrarProduto();
	private CadastrarUsuario cUsuario = new CadastrarUsuario();
	private CadastrarVenda cVenda = new CadastrarVenda();
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Produto> lista = new ArrayList<Produto>();
		
		Produto produto = cProduto.acharProdutoByNome(request.getParameter("produto"));
		lista.add(produto);
		
		Usuario usuario = cUsuario.acharUsuarioByNome(request.getParameter("usuario"));
		
		Venda venda = new Venda(usuario, lista, new Date());
		cVenda.cadastrarVenda(venda);
		
		RequestDispatcher rd = request
		        .getRequestDispatcher("sucesso/venda-cadastrada.xhtml");
		rd.forward(request,response);
	}
	
	
}
