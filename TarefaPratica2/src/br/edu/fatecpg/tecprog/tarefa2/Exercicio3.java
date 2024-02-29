package br.edu.fatecpg.tecprog.tarefa2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		//INICIO
		
		int matrizH[][] = new int[6][2];
		Scanner scan= new Scanner(System.in);
		
		for(int l=0;l<6;l++) {
			for(int c=0;c<2;c++) {
				System.out.print("Insira um numero: ");
				matrizH[l][c]= scan.nextInt();
				scan.close();
				
			}
		}
		System.out.println("MATRIZ ORIGINAL");
		for(int l=0;l<6;l++) {
			for(int c=0;c<2;c++) {
				System.out.print(matrizH[l][c]+" ");
				
				
			} System.out.println();
		}
		
		System.out.println("MATRIZ TRANSPOSTA");
		for(int c=0;c<2;c++) {
			for(int l=0;l<6;l++) {
				System.out.print(matrizH[l][c]+" ");
				
				
			} System.out.println();
		}
		
		scan.close();
		
		//FIM

	}

}
