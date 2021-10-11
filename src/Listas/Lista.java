package Listas;

import java.util.List;
import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		
		List lista = new ArrayList();
		lista.add(77);
		lista.add("Jorge");
		lista.add(300.23);
//		lista.add(80);
//		lista.remove(80);
		
		System.out.println("Lista com elementos" + lista);
		System.out.println("Lista Nome " + lista.get(1));
		System.out.println("Lista Sálario " + lista.get(2));
		lista.clear();
		System.out.println("Lista vazia " + lista);
		
	}

}
