package br.edu.controle;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parametro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parametro");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		}
		catch (ParametrosInvalidosException e) {
			System.err.println("O segundo parâmetro deve ser maior que o primeiro!!");
		}
		
	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

		if(parametroUm > parametroDois) {
			System.err.println("O parametro DOIS, deverá ser maior que o parametro UM");
		} else System.out.println("Contagem dos números");
		
		int contagem = parametroDois - parametroUm;
		
		for(int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + i);
		}
		   
	}
	
}
