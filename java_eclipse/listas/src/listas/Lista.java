package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "marco");
		
		System.out.println("o tamanho da lista de de " + list.size() + " espaços");
		for (String x: list) {
			System.out.println(x);
		}
		
		System.out.println("Indesx of Bob: "+ list.indexOf("Bob"));
		System.out.println("------------------");
		//list.removeIf(x -> (x.charAt(0) == 'M'));
		
		for (String x: list) {
			System.out.println(x);
		}
		System.out.println("Indesx of Bob: "+ list.indexOf("Bob"));
		
		List<String> result = list.stream().filter(x ->x.charAt(0) == 'A').collect(Collectors.toList());
		System.out.println("------ somente com a letra 'A'------------");
		for (String x: result) {
			System.out.println(x);
		}
		System.out.println("------ somente com a letra '------------");
		String name = list.stream().filter(x ->x.charAt(0) == 'j').findFirst().orElse(null);
		System.out.println(name);
	}

}
