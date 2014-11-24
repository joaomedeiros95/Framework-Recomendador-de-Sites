package Apresentação;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import Dados.IUsuarioDAO;
import Dados.IVendaDAO;
import Dados.UsuarioDAO;
import Dados.VendaDAO;
import Entidades.Usuario;
import Entidades.Venda;
import Negócio.ServiçoDeRecomendacao;

@WebServlet("/mostrarSugestao")
public class MostrarSugestaoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request, ServletResponse response) 
			throws ServletException ,IOException {
		IUsuarioDAO usuarioDAO = UsuarioDAO.getDAO();
		Usuario user = usuarioDAO.getUsuarioByNome(request.getParameter("nome"));
		
		IVendaDAO vendaDAO = VendaDAO.getDAO();
		ArrayList<Venda> vendas = vendaDAO.getVendasByUsuario(user);
		
		String[] retorno = new String[1000];
		retorno = ServiçoDeRecomendacao.iniciar(ServiçoDeRecomendacao.ALGORITMO1, vendas);

		request.setAttribute("sugestoes", retorno);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/mostrar-sugestao.jsp");
		rd.forward(request,response);
	}

}
