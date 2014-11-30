package excecoes;

public class NadaEncontradoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public NadaEncontradoException(String tabela) {
		super("Não foi encontrado nada na tabela " + tabela + ".");
	}

}
