package excecoes;

public class AtributoNaoExistenteException extends Exception{

	private static final long serialVersionUID = 1L;

	public AtributoNaoExistenteException() {
        
    }

    @Override
    public String getMessage() {
        return "Esse atributo não existe!";
    }
    
    
}
