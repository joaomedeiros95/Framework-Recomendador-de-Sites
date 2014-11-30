package apresentacao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import negocio.CadastrarUsuario;
import entidades.Usuario;
import excecoes.CampoInvalidoException;
import excecoes.NadaEncontradoException;

@WebServlet("/logarUsuario")
public class LogarUsuarioServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private Usuario user;
	private CadastrarUsuario cUsuario = new CadastrarUsuario();
	
	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		try {
			user = cUsuario.acharUsuarioByNome(request.getParameter("nome"));
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
		
		request.setAttribute("usuario", user);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/adicionar-venda.xhtml");
		rd.forward(request,response);
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

}
