package apresentacao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/tratamentoExcecao")
public class TratamentoExcecaoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static String mensagem;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("mensagem", mensagem);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/erro.xhtml");
		rd.forward(request,response);
	}

	public static String getMensagem() {
		return mensagem;
	}

	public static void setMensagem(String mensagem) {
		TratamentoExcecaoServlet.mensagem = mensagem;
	}

}
