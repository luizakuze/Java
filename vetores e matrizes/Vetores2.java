package Luiza;

public class Vetores2 {

	public static void main(String[] args) {
		int numeros[] = new int[10];
		
		System.out.println("Tamanho do vetor: " + numeros.length);
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i+3;
		}
		
		System.out.println(numeros[0]); // primeiro elemento
		System.out.println(numeros[9]); // último elemento
		
		
		// Os arrays possuem tamanho fixo e não podem ser aumentados/diminuídos
		
		
		// Os arrays possuem tipos de dados fixos e não aceitam tipos variados
		
		for (int i = 0; i < numeros.length; i++) {
			// Número aleatorio * 10
			numeros[i] = (int)Math.round(Math.random() * 10);
		}

		System.out.println(numeros[0]); // primeiro elemento
		System.out.println(numeros[9]); // último elemento
		

		// 0...1 double
		System.out.println(Math.random());
		
		for (int i: numeros) {
			System.out.println(i);
		}
		
	}
}
