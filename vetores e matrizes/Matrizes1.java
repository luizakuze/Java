package Luiza;

// Matrizes
// Vetores/arrays/matrizes multi-dimensionais


/* [linhas][colunas]
 * int numeros[3][3];
 * 
 * numeros[0][0] = 1;
 * numeros[0][1] = 2;
 * numeros[0][2] = 3;
 */


public class Matrizes1 {	
	public static void main(String[] args) {
		// Declaração
		int outros_numeros[][];
		
		// Declaração e definição de tamanho da matriz
		int numeros[][] = new int[3][3];

		// Declarar, definir o tamanho e inicializar
		int mainNumeros[][] = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		
		// Declarar uma matriz informando somente as linhas
		int matriz[][] = new int [2][];
		matriz[0] = new int[5];
		matriz[1] = new int[3];
		
		int novaMatriz[][] = { {1, 2}, {4, 5, 6, 7, 8}, {9, 10, 11} };
	}
}
