package Luiza;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		int idade;
		String nome;
		
		// Para receber dados do usuário via teclado
		Scanner teclado = new Scanner(System.in);
		
		
		// Primeiro executa o bloco e depois verifica o while
		do {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();
			
			System.out.println("Informe sua idade: ");
			//idade = teclado.nextInt(); // Bug!
			idade = Integer.parseInt(teclado.nextLine());
			
			System.out.println(nome + " tem " + idade + " anos.");
			
		} while (idade > 0);
		
		teclado.close();
	}
}
