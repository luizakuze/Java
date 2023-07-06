package Luiza;
// Operador ternário

// Se vc precisar criar a função main() // programa java
// main e no teclado pressionar CTRL + barra de espaço
public class OpTernario {

	public static void main(String[] args) {
		int valor = 10, numero;
		
		/*
		if (valor > 0) {
			numero = valor;
		} else {
			numero = 8;
		}
		*/
		
		// Operador ternário
		numero = (valor > 0) ? valor : 8;
		
		System.out.println(numero);
	}

}
