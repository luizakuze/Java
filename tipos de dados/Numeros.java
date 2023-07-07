package Luiza;

//Tipos de dados
// Num�ricos (inteiros e reais)

public class Numeros {
	public static void main(String[] args) {
		// Tipos prim�rios
		long num0 = 10;
		int num1 = 4; // inteiro
		short num2 = 4; // inteiro (menor)
		byte num3 = 4;
		
		// Tipos n�o prim�rios/primitivos
		Long num7 = (long) 99999; // Cast!!
		Integer num4 = 98;
		Short num5 = 7;
		Byte num6 = 9;

		System.out.println("Imprimindo n�meros");
		System.out.println("int -> Num1 = " + num1);
		System.out.println("short -> Num2 = " + num2);
		System.out.println("byte -> Num3 = " + num3);
		System.out.println("Integer -> Num4 = " + num4);
		System.out.println("Short -> Num5 = " + num5);
		System.out.println("Byte -> Num6 = " + num6);
		
		System.out.println("Mem�ria");
		System.out.println("int/integer " + Integer.SIZE + " bits");
		System.out.println("short/Short " + Short.SIZE + " bits");
		System.out.println("byte/Byte " + Byte.SIZE + " bits");
		
		System.out.println("M�nimos e m�ximos");
		System.out.println("Valor Min int/integer " + Integer.MIN_VALUE);
		System.out.println("Valor Max int/integer " + Integer.MIN_VALUE);
		System.out.println("Valor Min short/Short " + Short.MIN_VALUE);
		System.out.println("Valor Max short/Short " + Short.MIN_VALUE);
		System.out.println("Valor Min byte/Byte " + Byte.MIN_VALUE);
		System.out.println("Valor Max byte/Byte " + Byte.MIN_VALUE);
	}
}
