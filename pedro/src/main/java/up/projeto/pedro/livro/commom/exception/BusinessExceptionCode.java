package up.projeto.pedro.livro.commom.exception;

public enum BusinessExceptionCode {

	ERR001("CPF já cadastrado."),
	ERR002("CPF deve conter 11 digitos"),
	ERR003("Erro ao excluir o filme."),
	ERR004("Filme não encontrado com o ID informado."),
	ERR005("Não há filmes cadastrados."),
	ERR006("Filme não encontrado."),
	ERR007("Filme já cadastrado com esse titulo.");
	
	private final String message;
	
	private BusinessExceptionCode(final String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}
