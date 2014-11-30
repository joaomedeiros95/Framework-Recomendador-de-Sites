package negocio;

import java.util.ArrayList;
import java.util.Date;

import dados.IVendaDAO;
import dados.VendaDAO;
import entidades.Produto;
import entidades.Usuario;
import entidades.Venda;
import excecoes.CampoInvalidoException;
import excecoes.NadaEncontradoException;

public class CadastrarVenda {
	
	private IVendaDAO vendaDAO;
	private CadastrarProduto cProduto = new CadastrarProduto();
	private CadastrarUsuario cUsuario = new CadastrarUsuario();
	
	public void cadastrarVenda(String prod, String user) throws CampoInvalidoException, NadaEncontradoException {
		ArrayList<Produto> lista = new ArrayList<Produto>();
		
		Produto produto = cProduto.acharProdutoByNome(prod);
		lista.add(produto);
		
		Usuario usuario = cUsuario.acharUsuarioByNome(user);
		
		Venda venda = new Venda(usuario, lista, new Date());
		
		validate(produto, usuario);
		
		vendaDAO = VendaDAO.getDAO();
		vendaDAO.addVenda(venda);
	}
	

	public ArrayList<Venda> acharVendaByUsuario(Usuario usuario) throws CampoInvalidoException, NadaEncontradoException {
		if(usuario == null)
			throw new CampoInvalidoException("usuario");
		vendaDAO = VendaDAO.getDAO();
		ArrayList<Venda> retorno = vendaDAO.getVendasByUsuario(usuario);
		if(retorno == null)
			throw new NadaEncontradoException("Venda");
		else
			return retorno;
	}

	private void validate(Produto produto, Usuario usuario) throws NadaEncontradoException {
		if(produto == null)
			throw new NadaEncontradoException("Produto");
		if(usuario == null)
			throw new NadaEncontradoException("Usuario");
	}
}
