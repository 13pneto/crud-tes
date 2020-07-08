package up.projeto.pedro.livro.commom.handlerexception;
import up.projeto.pedro.livro.commom.exception.BusinessException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class BusinessExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(BusinessException.class)
	public ResponseEntity<?> generalException(BusinessException e){
		return ResponseEntity.badRequest().body(new Message(e.getMessage(),				 
				e.getCode().toString()));
	}
	
	//o que falta???
}

//request(http) -> server -> response(http) (conteudo -> json) 