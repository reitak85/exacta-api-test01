 package br.com.exacta.desafio.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class GastoNaoEncontradoException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2373217811008173023L;

	public GastoNaoEncontradoException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GastoNaoEncontradoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public GastoNaoEncontradoException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public GastoNaoEncontradoException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public GastoNaoEncontradoException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
