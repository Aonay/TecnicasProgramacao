package br.edu.fatecpg.tecprog.tarefa1;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		//INICIO
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Insira um numero inteiro: ");
		int num = ler.nextInt();
		int soma = 0;
		int impar = 1;		
		
		
		for(int c = 0;c<num;c++) {
			soma += impar;
			impar= impar+2;
		}
		
		System.out.println("A soma dos "+num+" impares é de:"+soma);
		
		ler.close();
		//FIM

	}

}
