package br.com.caelum.estoque.ws;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
@Stateless
public class EstoqueWS {

	private Map<String, ItemEstoque>repositorio = new HashMap<String, ItemEstoque>();

	public EstoqueWS() {

		//simula um banco de dados, mapeia codigo para quantidade
		repositorio.put("SOA", new ItemEstoque("SOA", 5));
		repositorio.put("TDD", new ItemEstoque("TDD", 3));
		repositorio.put("RES", new ItemEstoque("RES", 10));
		repositorio.put("LOG", new ItemEstoque("LOG", 1));
		repositorio.put("WEB", new ItemEstoque("WEB", 2));
		repositorio.put("ARQ", new ItemEstoque("ARQ", 7));

	}

	@WebMethod(operationName="ItensPeloCodigo")
	@WebResult(name="ItemEstoque")
	public List<ItemEstoque> getQuantidade(@WebParam(name="codigo") List<String> codigos) {

		List<ItemEstoque> itens = new ArrayList<ItemEstoque>();

		if(codigos == null || codigos.isEmpty()) {
			return itens;
		}

		for (String codigo : codigos) {
			if(repositorio.containsKey(codigo)) {
				itens.add(repositorio.get(codigo));
			}
		}

		return itens;

	}

}
