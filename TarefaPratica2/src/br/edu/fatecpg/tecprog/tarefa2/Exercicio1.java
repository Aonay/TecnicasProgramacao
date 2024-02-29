package br.edu.fatecpg.tecprog.tarefa2;

public class Exercicio1 {

	public static void main(String[] args) {
		int [][] numeros = new int[3][3];
		int [][] numeros2= new int[3][3];
		int [][] numeros3= new int[3][3];
		
		
		InsertMatriz.addMatriz(numeros, "A");
		InsertMatriz.addMatriz(numeros2, "B");
		
		for(int l=0;l<numeros.length;l++){
			for(int c=0;c<numeros.length;c++){
				numeros3[l][c]= numeros[l][c]+numeros2[l][c];
			}
		}
		System.out.println("Matriz C - SOMA");
		for(int[]dadosnumero:numeros3){
			for(int numero:dadosnumero){
				System.out.print(numero+"|");
			}
			System.out.println("\n");
		}

	}

}
