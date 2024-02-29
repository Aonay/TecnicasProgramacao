package br.edu.fatecpg.tecprog.tarefa1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		//INICIO
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um    número: ");
		double n1 = ler.nextDouble();
		System.out.println("Digite outro número: ");
		double n2 = ler.nextDouble();
		
		if(n1==n2) {
			System.out.println("Os números são iguais!");
		}
		else if(n1>n2) {
			System.out.println("Os números são diferentes!2 O primeiro é maior!");
		}
		else {
			System.out.println("Os números são diferentes! O segundo numero é maior!");
		
		}
		ler.close();
		
		//FIM
	}

}
