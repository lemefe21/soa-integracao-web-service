package br.com.caelum.estoque.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class EstoqueService extends UnicastRemoteObject implements EstoqueRmi{

	//objeto que sabe procurar itens do estoque
	//implementa o contrato com o método disponibilizado remotamente

	private static final long serialVersionUID = 1L;
	private Map<String, ItemEstoque>repositorio = new HashMap<String, ItemEstoque>();

	public EstoqueService() throws RemoteException {
		//simula um repositorio com Itens salvos no banco
		repositorio.put("ARQ", new ItemEstoque("ARQ", 5));
		repositorio.put("SOA", new ItemEstoque("SOA", 911));
		repositorio.put("TDD", new ItemEstoque("TDD", 2));
		repositorio.put("RES", new ItemEstoque("RES", 1));
		repositorio.put("LOG", new ItemEstoque("LOG", 3));
		repositorio.put("WEB", new ItemEstoque("WEB", 4));
	}

	@Override
	public ItemEstoque getItemEstoque(String codigoProduto) throws RemoteException {

		//saida ocorre no server, o server instância o EstoqueService e o mantém na sua thread
		System.out.println("Verificando estoque do produto " + codigoProduto);

		return this.repositorio.get(codigoProduto);
	}

}
