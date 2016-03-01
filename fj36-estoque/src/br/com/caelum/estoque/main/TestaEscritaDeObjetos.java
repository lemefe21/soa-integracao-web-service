package br.com.caelum.estoque.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.estoque.rmi.ItemEstoque;

public class TestaEscritaDeObjetos {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		try(ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("itens_new.bin"))){

			ItemEstoque item1 = new ItemEstoque("ARQ", 2);
			ItemEstoque item2 = new ItemEstoque("SOA", 3);
			ItemEstoque item3 = new ItemEstoque("SQL", 5);
			ItemEstoque item4 = new ItemEstoque("SCR", 7);

			List<ItemEstoque>itens = new ArrayList<ItemEstoque>();
			itens.add(item1);
			itens.add(item2);
			itens.add(item3);
			itens.add(item4);

			oos.writeObject(itens);

		}
	}
}