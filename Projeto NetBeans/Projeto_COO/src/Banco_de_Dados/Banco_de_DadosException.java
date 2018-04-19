package Banco_de_Dados;

public class Banco_de_DadosException extends Exception {

	private static final long serialVersionUID = 1L;

	public Banco_de_DadosException() {
		super();
	}

	public Banco_de_DadosException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public Banco_de_DadosException(String message, Throwable cause) {
		super(message, cause);
	}

	public Banco_de_DadosException(String message) {
		super(message);
	}

	public Banco_de_DadosException(Throwable cause) {
		super(cause);
	}
}
