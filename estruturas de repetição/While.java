package Luiza;

//While e do while

// Biblioteca necess�ria p entrar via teclado
import java.util.Scanner;

// Caso do Bug ao ler string e int em um loop!!

public class While {
	public static void main(String[] args) {
		
		int idade = 1;
		String nome;
		
		// Para receber dados do usu�rio via teclado
		Scanner teclado = new Scanner(System.in);
		
		while (idade > 0) {
			
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine(); // Considera espa�os
			// nome = teclado.next(); // n�o considera espa�os
			
			System.out.println("Informe sua idade: ");
			//idade = teclado.nextInt(); // Bug!
			idade = Integer.parseInt(teclado.nextLine());
			
			System.out.println(nome + " tem " + idade + " anos.");
			
		}
		
		teclado.close();
	}
}
