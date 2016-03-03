package br.com.caelum.estoque.ws;

import javax.xml.ws.WebFault;

@WebFault(name="AutorizacaoFault")
public class AutorizacaoException extends RuntimeException {

	private static final long serialVersionUID = -1830307867921138298L;

	public AutorizacaoException(String mensagem) {
		super(mensagem);
	}

}
