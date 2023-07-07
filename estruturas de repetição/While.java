package Luiza;

//While e do while

// Biblioteca necessária p entrar via teclado
import java.util.Scanner;

// Caso do Bug ao ler string e int em um loop!!

public class While {
	public static void main(String[] args) {
		
		int idade = 1;
		String nome;
		
		// Para receber dados do usuário via teclado
		Scanner teclado = new Scanner(System.in);
		
		while (idade > 0) {
			
			System.out.println("Informe seu nome: ");
			nome = teclado.nextLine(); // Considera espaços
			// nome = teclado.next(); // não considera espaços
			
			System.out.println("Informe sua idade: ");
			//idade = teclado.nextInt(); // Bug!
			idade = Integer.parseInt(teclado.nextLine());
			
			System.out.println(nome + " tem " + idade + " anos.");
			
		}
		
		teclado.close();
	}
}
