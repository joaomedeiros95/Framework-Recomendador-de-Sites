package Apresentação;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import Dados.IUsuarioDAO;
import Dados.UsuarioDAO;
import Entidades.Usuario;

@WebServlet("/logarUsuario")
public class LogarUsuarioServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private IUsuarioDAO iUsuarioDAO;
	private Usuario user;
	
	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		iUsuarioDAO = UsuarioDAO.getDAO();
		user = iUsuarioDAO.getUsuarioByNome(request.getParameter("nome"));
		
		request.setAttribute("usuario", user);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/adicionar-venda.jsp");
		rd.forward(request,response);
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

}
