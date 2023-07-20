package Luiza;

/*
Tratando exceções com try/catch

Utilizamos o try para tentar realizar algo, geralemnte realizar aquilo que 
pode acarretar em um problema.

Utilizamos o catch para capturar um erro e com isso oferecer ao usuário 
uma mensagem adequada sem que o sistema quebre.
 */

public class Programa1 {

	public static void main(String[] args) {
		int numeros[] = new int[5]; //0...4 / 0, 1, 2, 3, 4
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 3 * 2;
		}
		
		
		// Exceção, acessando um índice que não existe!!!
		
		for (int i = 0; i <= numeros.length; i++) {
			try { // Tente fazer isso
				System.out.println(numeros[i]);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Você está tentando acessar uma posição do array que não existe!");
			}
		}
	}
	
}

