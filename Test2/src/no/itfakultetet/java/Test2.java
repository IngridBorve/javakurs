package no.itfakultetet.java;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
	
		System.out.println("hei verden");
		
		//Java 8
		ArrayList<String> navn = new ArrayList<>();
		navn.add("Ola");
		navn.add("Kari");
		
		for (String person : navn) {
			System.out.println("Navn: " + person);
		}
		
		System.out.println("---------------------------------------");
		
		// Java 11: mer konsis kode
		List<String> navn2 = List.of("Ola", "Kari", "Petter"); //lager en liste som ikke kan endres på
		navn2.forEach(System.out::println);
		
		
	} //main end	
}
