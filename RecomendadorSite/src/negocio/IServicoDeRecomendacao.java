package negocio;

import excecoes.AcessoIlegalException;
import excecoes.AtributoNaoExistenteException;

public interface IServicoDeRecomendacao {
	
	public abstract String[] iniciarAlgoritmo() throws AtributoNaoExistenteException, AcessoIlegalException;

}
