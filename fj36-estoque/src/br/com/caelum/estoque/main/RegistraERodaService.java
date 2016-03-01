package br.com.caelum.estoque.main;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import br.com.caelum.estoque.rmi.EstoqueService;

public class RegistraERodaService {

	public static void main(String[] args) throws RemoteException, MalformedURLException {

		//sobe o catálogo na porta 1099
		LocateRegistry.createRegistry(1099);
		//bind ou rebind é o registro do objetos remotos
		Naming.rebind("/estoque", new EstoqueService());

		System.out.println("Estoque registrado e rodando...");

	}

}
