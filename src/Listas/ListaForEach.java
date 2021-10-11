package Listas;

import java.util.ArrayList;
import java.util.List;

public class ListaForEach {
	
	public static void main(String[] args) {
		
	
	
	List lista = new ArrayList();
	
	lista.add("Jorge");
	lista.add("Antonio");
	lista.add("Marcelo");
	lista.add("Lúcia");
	lista.remove("Lúcia");
	
	System.out.println(lista.size());
	lista.forEach(System.out::println);

	
	System.out.println("Lista com elementos" + lista);
	System.out.println("Lista Nome " + lista.get(1));
	System.out.println("Lista Sálario " + lista.get(2));
	lista.clear();
	System.out.println("Lista vazia " + lista);
	}
}
