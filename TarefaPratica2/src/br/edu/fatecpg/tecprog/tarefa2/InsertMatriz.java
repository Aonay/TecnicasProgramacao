package br.edu.fatecpg.tecprog.tarefa2;

import java.util.Scanner;

public class InsertMatriz {


		public static void addMatriz(int M[][],String n) {
			
			Scanner scan = new Scanner(System.in);
			
			for(int l=0;l<M.length;l++){
				for(int c=0;c<M.length;c++){
					System.out.println("Digite um numero da posicao:["+l+"]["+c+"] da Matriz "+n+":");
					M[l][c] = scan.nextInt();
				}
			}
			System.out.println("Matriz "+n+":");
			for(int[]dadosnumero:M){
				for(int numero:dadosnumero){
					System.out.print(numero+"|");
				}
				
				System.out.println("\n");
				
			}

	}

}
