package br.edu.fatecpg.tecprog.tarefa1;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		//INICIO
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int n = ler.nextInt();
		int fator = n;
		
		for(int c=n-1;c>0;c--) {
			fator = fator*c; 
			
		}
		System.out.println(n+"!= "+fator);
		
		ler.close();
		
		//FIM

	}

}
