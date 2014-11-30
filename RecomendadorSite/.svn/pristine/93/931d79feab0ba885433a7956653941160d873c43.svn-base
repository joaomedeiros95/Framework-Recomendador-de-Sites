package negocio;

import java.util.ArrayList;

import entidades.Usuario;
import entidades.Venda;
import excecoes.AcessoIlegalException;
import excecoes.AtributoNaoExistenteException;
import excecoes.CampoInvalidoException;
import excecoes.NadaEncontradoException;

public abstract class ServicoDeRecomendacao implements negocio.IServicoDeRecomendacao {
	
	public static final int ALGORITMO1 = 1;
	public static final int ALGORITMO2 = 2;
	public static final int ALGORITMO3 = 3;

	private dados.IVendaDAO iVendaDAO;

	private negocio.IStalker iStalker;
	
	private static CadastrarUsuario cUsuario = new CadastrarUsuario();
	private static CadastrarVenda cVenda = new CadastrarVenda();
	
	public static ServicoDeRecomendacao servico;
	
	public static String[] realizar(int algoritmo, String nomeUsuario, String atributo) throws CampoInvalidoException, NadaEncontradoException, AtributoNaoExistenteException, AcessoIlegalException {
		Usuario user = null;
		user = cUsuario.acharUsuarioByNome(nomeUsuario);
		ArrayList<Venda> vendas = cVenda.acharVendaByUsuario(user);
		
		switch (algoritmo) {
		case ALGORITMO1:
			servico = new Algoritmo1(vendas);
			break;
		case ALGORITMO2:
			servico = new Algoritmo2(vendas, atributo);
			break;
		case ALGORITMO3:
			servico = new Algoritmo3();
			break;
		default:
			break;
		}
		return servico.iniciarAlgoritmo();
	}

	public abstract String[] iniciarAlgoritmo() throws AtributoNaoExistenteException, AcessoIlegalException;

}
