package Luiza;

public class OperacoesMatematicas {
	public static void main(String[] args) {
		int num1 = 5, num2 = 10, resultado;
		float resultado2;
		
		// Soma
		resultado = num1 + num2;
		System.out.println("A soma de " + num1 + " + " + num2 + " � " + resultado);
		
		// Subtra��o
		resultado = num1 - num2;
		System.out.println("A subtra��o de " + num1 + " - " + num2 + " � " + resultado);
		
		// Multiplica��o
		resultado = num1 * num2;
		System.out.println("A multiplica��o de " + num1 + " * " + num2 + " � " + resultado);
				
		// Divis�o (inteira)
		resultado = num1 / num2;
		System.out.println("A divis�o inteira de " + num1 + " / " + num2 + " � " + resultado);
		
		// Divis�o (real)
		resultado2 = (float) num1 / (float) num2; //Cast
		System.out.println("A divis�o inteira de " + num1 + " / " + num2 + " � " + resultado2);
		
		// M�dulo
		/*
		 * Se o resto do m�dulo da vari�vel por 2 for zero, a vari�vel
		 * � par. Se o resto for 1, a vari�vel � �mpar.
		 */
		resultado = num1 % 2; //Cast
		System.out.println("O resto da divis�o de " + num1 + " / " + num2 + " � " + resultado);
		resultado = num2 % 2; //Cast
		System.out.println("O resto da divis�o de " + num1 + " / " + num2 + " � " + resultado);
				
	}
}
