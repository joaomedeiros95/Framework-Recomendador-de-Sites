package excecoes;

public class AcessoIlegalException extends Exception{

	private static final long serialVersionUID = 1L;

	public AcessoIlegalException() {
    }

    @Override
    public String getMessage() {
        return "Acesso Ilegal!";
    }
    
    
}
