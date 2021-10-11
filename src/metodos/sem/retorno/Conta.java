package metodos.sem.retorno;

public class Conta {
	
	int numeroConta;
	String titular;
	double saldo;
	
	public void sacar (double valor) {
		// TODO Auto-generated method stub
		
		saldo -= valor;
	}
	
	public void depositat(double valor) {
		// TODO Auto-generated method stub
		
		saldo += valor; 

	}
	

}
