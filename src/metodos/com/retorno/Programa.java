package metodos.com.retorno;

public class Programa {
	
	public static void main(String[] args) {
		
		System.out.println("Metodo retorno");
		MetodoRetorno teste = new MetodoRetorno();
		teste.atributo1 = 30;
		System.out.println(teste.metodo1());
	}

	
}
