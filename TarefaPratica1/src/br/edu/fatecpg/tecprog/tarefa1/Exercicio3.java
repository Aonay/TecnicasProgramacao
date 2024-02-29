package br.edu.fatecpg.tecprog.tarefa1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		//INICIO
		Scanner ler = new Scanner(System.in);
		int op;
		double lado,raio,areaq,areac;
		
		String menu = ("""
				╔════Escolha uma das opções:════╗
				║ 1 - Calcular área do quadrado ║
				║ 2 - Calcular área do circulo  ║
				╚═══════════════════════════════╝""");
		System.out.println(menu);
		op = ler.nextInt();
		
		switch(op) {
		case 1 :
			System.out.print("Digite o lado do quadrado: ");
			lado = ler.nextDouble();
			areaq = lado*lado;
			System.out.println("A área do quadrado é: "+areaq);
			break;
			
		case 2:
			System.out.print("Digite o raio do circulo: ");
			raio = ler.nextDouble();
			areac = 3.14*(raio*raio);
			System.out.println("A área do circulo é: "+areac);
			break;
		}
		ler.close();
		
		//FIM
		
		
	}

}
