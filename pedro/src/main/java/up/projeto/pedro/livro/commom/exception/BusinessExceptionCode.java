package up.projeto.pedro.livro.commom.exception;

public enum BusinessExceptionCode {

	ERR001("CPF já cadastrado!"),
	ERR002("CPF deve conter 11 digitos");
	
	private final String message;
	
	private BusinessExceptionCode(final String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}
