package Luiza;
// Operador tern�rio

// Se vc precisar criar a fun��o main() // programa java
// main e no teclado pressionar CTRL + barra de espa�o
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
		
		// Operador tern�rio
		numero = (valor > 0) ? valor : 8;
		
		System.out.println(numero);
	}

}
