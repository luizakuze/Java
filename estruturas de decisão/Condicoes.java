package Luiza;

// If, else, else if
public class Condicoes {

	public static void main(String[] args) {
		// Declarando e inicializando a vari�vel
		int numero = 10;
		
		// Condi��es
		if (numero > 5) {
			System.out.println("Sim, o n�mero " + numero + " � maior que 5");	
		} else if (numero == 5) {
			System.out.println("N�o, o n�mero " + numero + " � igual a 5");
		} else if (numero % 2 == 0) {
			System.out.println("O n�mero " + numero + " � par");
		} else {
			System.out.println("N�o, o n�mero " + numero + " n�o � maior que 5");
		}
		
		
		
	}
}
