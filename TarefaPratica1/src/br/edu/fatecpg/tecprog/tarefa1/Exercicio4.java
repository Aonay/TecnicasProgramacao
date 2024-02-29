package br.edu.fatecpg.tecprog.tarefa1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um número para ver sua tabuada: ");
		int num = ler.nextInt();
		
		for(int c=1;c<=10;c++) {
			int res = c*num;
			System.out.println(num+" x "+c+" = "+res);
		}
		
		ler.close();

	}
	

}
