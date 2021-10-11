package com.unicas.funcoes;

//import javax.swing.JOptionPane;
import javax.swing.*;

public class Inputs {
	public static void main( String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
//		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual é a sua idade?"));
//		double peso = Double.parseDouble(JOptionPane.showInputDialog("Qual é o seu peso?"));
		
		/*System.out.println("Nome : " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Peso : " + peso);
		*/
		
		JOptionPane.showMessageDialog(null, "Nome : " + nome);
	}

}
