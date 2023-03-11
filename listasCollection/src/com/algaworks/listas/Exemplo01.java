package com.algaworks.listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Exemplo01 {
	public static void main(String [] args) {
		List<String>nomes = new ArrayList<>();
		
		nomes.add("João");
		nomes.add("Francisco");
		nomes.add("Simone");
/*		
		System.out.println(nomes);
		
		nomes.remove(2);
		
		System.out.println(nomes);
		
		nomes.remove("João");
		
		System.out.println(nomes);
		
		for (int i=0; i< nomes.size(); i++) {
			System.out.println("Nome " + i +": " + nomes.get(i));
		} 
		
		for (String nome : nomes) {
			System.out.println("Nome: " + nome);
		} //enhanced for 
		
		// Interface Funcional Consumer- functional interface: 
		 * utiliza o metodo abstrato não instanciado accept *
		nomes.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}			
		});
		// Usando lambda expression (nome -> {} );
		
		nomes.forEach(nome -> {
			System.out.println(nome);
		});
		// usando method reference
		 */
		 nomes.forEach(System.out::println);
		
		
		
		
	}
}
