package br.com.caelum.estoque.rmi;

import java.io.Serializable;

public class ItemEstoque implements Serializable{

	//private static final long serialVersionUID = 1L;
	//anterado para 1L depois de ter gerado o arquivo, � lan�ado java.io.InvalidClassException
	//private transient String codigo; n�o serializado

	private static final long serialVersionUID = -7524366900568591633L;
	private String codigo;
	private Integer quantidade;

	public ItemEstoque(String codigo, Integer quantidade) {
		this.codigo = codigo;
		this.quantidade = quantidade;
	}
	public String getCodigo() {
		return codigo;
	}
	public Integer getQuantidade() {
		return quantidade;
	}

}
