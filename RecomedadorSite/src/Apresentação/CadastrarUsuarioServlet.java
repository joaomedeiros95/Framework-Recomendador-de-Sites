package Apresentação;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import Entidades.Usuario;
import Negócio.CadastrarUsuario;

@WebServlet("/adicionaUsuario")
public class CadastrarUsuarioServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private Negócio.ICadastrarUsuario iCadastrarUsuario;
        
	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		Usuario usuario = new Usuario(1, request.getParameter("nome"), 
										 request.getParameter("cpf"), 
										 request.getParameter("rg"), 
										 request.getParameter("telefone"), 
										 request.getParameter("end"), 
										 request.getParameter("obs"));
		iCadastrarUsuario = new CadastrarUsuario();
		iCadastrarUsuario.cadastrarUsuario(usuario);
		
		RequestDispatcher rd = request
		        .getRequestDispatcher("sucesso/usuario-cadastrado.jsp");
		rd.forward(request,response);
	}

}
