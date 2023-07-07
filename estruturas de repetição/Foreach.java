package Luiza;

// Foreach // Para cada
public class Foreach {
	public static void main(String[] args) {
		String nome = "Luiza Kuze";
		
		// Para cada um dos caracteres da string, imprima o caracter
		for (char letra : nome.toCharArray()) {
			System.out.println(letra);
			//System.out.print(letra);
		}
	}
}
