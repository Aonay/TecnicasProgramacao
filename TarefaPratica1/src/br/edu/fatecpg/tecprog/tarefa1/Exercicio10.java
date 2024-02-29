package br.edu.fatecpg.tecprog.tarefa1;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		//INICIO
		Scanner ler = new Scanner(System.in);
		String senha = "Java123";
		String senhadigitada;
		
		
		do {
			System.out.println("Digite a senha: ");
			senhadigitada = ler.nextLine();
			if(!senhadigitada.equals(senha)) {
				System.out.println("Senha incorreta!");
			}
		}while (!senhadigitada.equals(senha)); 
		
		System.out.println("Senha correta!");
		
		ler.close();
		
		
		//FIM

	}

}
