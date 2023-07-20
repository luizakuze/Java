package Luiza;

// Finally

// Acontece independente se entrou no catch ou não
// É uma sengunda ação
import java.util.Scanner;

public class Programa2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número para divisão: ");
		int num1 = teclado.nextInt();
		
		System.out.println("Informe o segundo número para divisão: ");
		int num2 = teclado.nextInt();
		
		try {
			System.out.println("A divisão de " + num1 + " por " + num2 + " é " + num1/num2);
		} catch (ArithmeticException e) {
			System.out.println("Não é possível a divisião de " + num1 + " por " + num2);
		} finally { // !!!
			System.out.println("Continua o processo...");
		}
		
		teclado.close();
	}

}
