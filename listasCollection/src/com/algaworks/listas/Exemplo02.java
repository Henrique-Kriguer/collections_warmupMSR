package com.algaworks.listas;

import java.util.ArrayList;
import java.util.List;

public class Exemplo02 {
	
	public static void main(String[] args) {
		
		List<Cliente> clientes = new ArrayList<>();
		
		clientes.add(new Cliente (1L, "Henrique"));
		clientes.add(new Cliente (2L, "Simone"));
		clientes.add(new Cliente (3L, "Francisco"));
		
		clientes.forEach(cliente -> System.out.printf("ID: %d, Nome: %s%n",
				cliente.getId(), cliente.getNome()));
	}

}
