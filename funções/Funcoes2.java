package Luiza;

// Ainda sobre funções...
public class Funcoes2 {
	public static void main(String[] args) {
		int valor1 = 6, valor2 = 4, res;
		
		//res = soma(valor1, valor2);
		
		//System.out.println("O resultado é " + res);
		System.out.println("O resultado é " + soma(valor1, valor2));
	
		System.out.println(mensagem());
	}

	// Função que retorna um inteiro
	static int soma(int v1, int v2) {
		return v1 + v2;
	}
	
	// Função que retorna uma string
	static String mensagem() {
		return "Olá mundo";
	}

}
