package Apresentação;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import Entidades.Usuario;
import Entidades.Venda;
import Negócio.CadastrarUsuario;
import Negócio.CadastrarVenda;
import Negócio.ServiçoDeRecomendacao;

@WebServlet("/mostrarSugestao")
public class MostrarSugestaoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private CadastrarUsuario cUsuario = new CadastrarUsuario();
	private CadastrarVenda cVenda = new CadastrarVenda();

	public void service(ServletRequest request, ServletResponse response) 
			throws ServletException ,IOException {
		Usuario user = cUsuario.acharUsuarioByNome(request.getParameter("nome"));
		ArrayList<Venda> vendas = cVenda.acharVendaByUsuario(user);
		
		String[] retorno = new String[1000];
		retorno = ServiçoDeRecomendacao.realizar(ServiçoDeRecomendacao.ALGORITMO1, vendas);

		request.setAttribute("sugestoes", retorno);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/mostrar-sugestao.xhtml");
		rd.forward(request,response);
	}

}
