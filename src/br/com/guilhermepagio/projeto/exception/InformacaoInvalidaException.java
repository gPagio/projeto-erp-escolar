package br.com.guilhermepagio.projeto.exception;

@SuppressWarnings("serial")
public class InformacaoInvalidaException extends RuntimeException {

	public InformacaoInvalidaException(String msg) {
		super(msg);
	}

}
