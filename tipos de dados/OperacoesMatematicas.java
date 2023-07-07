package Luiza;

public class OperacoesMatematicas {
	public static void main(String[] args) {
		int num1 = 5, num2 = 10, resultado;
		float resultado2;
		
		// Soma
		resultado = num1 + num2;
		System.out.println("A soma de " + num1 + " + " + num2 + " é " + resultado);
		
		// Subtração
		resultado = num1 - num2;
		System.out.println("A subtração de " + num1 + " - " + num2 + " é " + resultado);
		
		// Multiplicação
		resultado = num1 * num2;
		System.out.println("A multiplicação de " + num1 + " * " + num2 + " é " + resultado);
				
		// Divisão (inteira)
		resultado = num1 / num2;
		System.out.println("A divisão inteira de " + num1 + " / " + num2 + " é " + resultado);
		
		// Divisão (real)
		resultado2 = (float) num1 / (float) num2; //Cast
		System.out.println("A divisão inteira de " + num1 + " / " + num2 + " é " + resultado2);
		
		// Módulo
		/*
		 * Se o resto do módulo da variável por 2 for zero, a variável
		 * é par. Se o resto for 1, a variável é ímpar.
		 */
		resultado = num1 % 2; //Cast
		System.out.println("O resto da divisão de " + num1 + " / " + num2 + " é " + resultado);
		resultado = num2 % 2; //Cast
		System.out.println("O resto da divisão de " + num1 + " / " + num2 + " é " + resultado);
				
	}
}
