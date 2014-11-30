package excecoes;

import java.util.List;

public class CampoInvalidoException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public CampoInvalidoException(List<String> campos) {
		super("O campo " + campos + " não é válido.");
	}
	
	public CampoInvalidoException(String campo) {
		super("O campo " + campo + " não é válido.");
	}

}
