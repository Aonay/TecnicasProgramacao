package br.edu.fatecpg.tecprog.tarefa1;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		//INICIO
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro: ");
		int num = ler.nextInt();
		int resto = num % 2;
		if(resto == 0){
			System.out.println("O numero é PAR");
		}
		else {
			System.out.println("O numero é IMPAR");
		}
		ler.close();
		
		
		
		
		//FIM

		
	}

}
