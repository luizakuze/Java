package Luiza;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		int idade;
		String nome;
		Scanner teclado = new Scanner(System.in);
		
		// Vari�vel de controle; condi��o de parada; forma de incremento
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine();
			
			System.out.println("Informe sua idade: ");
			//idade = teclado.nextInt(); // Bug!
			idade = Integer.parseInt(teclado.nextLine());
			
			
			if (idade > 0) {
				System.out.println(nome + " tem " + idade + " anos.");
			}
		}
		
		
		teclado.close();
	}

}
