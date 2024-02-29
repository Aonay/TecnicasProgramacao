package br.edu.fatecpg.tecprog.tarefa1;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		//INICIO
		Scanner ler = new Scanner(System.in);
		boolean nomeverif = false;
		String[] nomes = new String[5];
		
		for(int c=0;c < nomes.length;c++) {
			System.out.println("digite um nome:");
			nomes[c] = ler.nextLine();
		}
		
		System.out.println("Digite um nome para pesquisa: ");
		String pesq = ler.nextLine();
		
		for(int c = 0;c<nomes.length;c++) {
			if (nomes[c].equals(pesq)) {
				nomeverif = true;	
			}
		}
		if(nomeverif){
			System.out.println("O nome está na lista!");
		}else {
			System.out.println("Nome não encontrado!");
		}
		ler.close();
		//FIM

	}

}
