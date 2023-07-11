package Luiza;

import java.util.Scanner;

/* 

Exercício: Escreva uma função que gera uma pirâmide de altura n 
e base 2*n-1. Por exemplo, a saída para n = 6 seria:
 
 		*
 	   ***
 	  *****
 	 *******
    *********
   *********** 
   
*/

public class Piramide {

	public static void main(String[] args) {
		int n;
		
		Scanner teclado = new Scanner (System.in);

		// Lê n do teclado
		System.out.println("Entre com um número: ");
		n = teclado.nextInt();
		
		// Imprime a pirâmide
		piramide(n);
		
		teclado.close();
	}
	
	static void piramide (int n) {
		// quantidade de linhas
		for (int i = 1; i <= n; i++) {
			// quantidade de espaços na frente 
	        for (int j = 1; j <= n - i; j++) {
	            System.out.print(' ');
	        }
			
			// quantidade de asteriscos
			for (int k = 1; k <= 2*i-1; k++) {
					System.out.print('*');
				
			}
			
			System.out.println();
		}
	}

}
