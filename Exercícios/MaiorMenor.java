package Luiza;

import java.util.Scanner;

/* Exercício: Fazer uma função que verifica se o número é maior, 
 * menor ou igual a zero. Sendo que para maior retorna 1, para 
 * menor retorna -1 e para igual a zero retorna 0
*/
public class VerificaNumero {
		public static void main (String[] args) {
			int num;
			
			Scanner teclado = new Scanner(System.in);
			
			// Recebe o número a ser analisado
			System.out.println("Entre com o número:");
			num = teclado.nextInt();
			
			// Analisa e imprime o resultado
			int res = resultado(num);
			System.out.println("O resultado: " + res);
			
			teclado.close();
		}
		
		// Função que verifica o valor do número
		static int resultado (int numero) {
			if (numero > 0) {
				return 1;
			} else if (numero < 0) {
				return -1;
			} else {
				return 0;
			}
		}
}
