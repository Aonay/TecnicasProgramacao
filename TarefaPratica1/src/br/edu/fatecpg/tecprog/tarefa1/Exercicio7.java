package br.edu.fatecpg.tecprog.tarefa1;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		//INICIO
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite uma idade: ");
		
		int idade = ler.nextInt();
		
		if(idade <18) {
			System.out.println("Menor de idade.");
		}else if (idade >=18 & idade <60) {
			System.out.println("Adulto.");
		}else {
			System.out.println("Idoso.");
		}
		ler.close();

	}

}
