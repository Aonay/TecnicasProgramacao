package br.edu.fatecpg.tecprog.tarefa1;

import java.util.Scanner;


public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite um numero: ");
		
		Scanner ler = new Scanner(System.in);
		double num = ler.nextDouble();
		
		
		if(num < 0) {
			System.out.println("Numero Negativo!");
		}
		else {
			System.out.println("Numero Positivo!");
		}ler.close();

	}	

}
