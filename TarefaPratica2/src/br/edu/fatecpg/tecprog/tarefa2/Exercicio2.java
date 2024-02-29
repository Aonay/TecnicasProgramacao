package br.edu.fatecpg.tecprog.tarefa2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// INICIO
		String login,senha,credenciais[][]=new String[6][2];
		Scanner scan = new Scanner(System.in);
		boolean conflogsen=false;
		
		for(int l=0;l<6;l++){
			for(int c=0;c<2;c++){
				if(c==0){
				System.out.print("Registre o Login: ");
				credenciais[l][c]= scan.nextLine();
				}
				else{
				System.out.print("Registre a senha: ");
				credenciais[l][c]= scan.nextLine();
				}
			}
		}
		
		
		do{
			System.out.print("Digite um login");
			login = scan.nextLine();
			System.out.print("Digite a senha");
			senha = scan.nextLine();
			
			for(int l=0;l<6;l++){
				if(credenciais[l][0].equals(login) && credenciais[l][1].equals(senha)){
					conflogsen = true;
				}
			}
			
			if(!conflogsen) {
			System.out.println("Login ou senha invalidos, tente novamente");
			}else {
				System.out.println("Senha correta! Logando...");
			}
		
		}
		while(!conflogsen);
		
		
		//FIM

	}

}
