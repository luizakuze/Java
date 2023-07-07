package Luiza;

// Tipos de dados alfanuméricos
// Caracteres e strings

public class AlfaNumericos {

	public static void main(String[] args) {
		// Tipos primitivos
		char letra1 = 'a';
		char letra2 = 97; // 97 em decimal == 'a'
		letra2 = (char) (letra2 + 1); // Cast
		// não existe o tipo primitivo "string" em Java
		
		System.out.println("Letra1: " + letra1);
		System.out.println("Letra2: " + letra2);
		
		
		// Tipos não primitivos
		Character letra3 = 'A';
		String letras = "teste";
		
		System.out.println("Letra3: " + letra3);
		System.out.println("Letras: " + letras);
		
		System.out.println("Tamanho da String: " + letras.length());
		
		// Tamanho da string + o quanto ocupa na memória
		System.out.println("String " + (Character.SIZE * letras.length()) + " bits");
	}

}
