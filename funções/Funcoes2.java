package Luiza;

// Ainda sobre fun��es...
public class Funcoes2 {
	public static void main(String[] args) {
		int valor1 = 6, valor2 = 4, res;
		
		//res = soma(valor1, valor2);
		
		//System.out.println("O resultado � " + res);
		System.out.println("O resultado � " + soma(valor1, valor2));
	
		System.out.println(mensagem());
	}

	// Fun��o que retorna um inteiro
	static int soma(int v1, int v2) {
		return v1 + v2;
	}
	
	// Fun��o que retorna uma string
	static String mensagem() {
		return "Ol� mundo";
	}

}
