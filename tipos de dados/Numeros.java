package Luiza;

//Tipos de dados
// Numéricos (inteiros e reais)

public class Numeros {
	public static void main(String[] args) {
		// Tipos primários
		long num0 = 10;
		int num1 = 4; // inteiro
		short num2 = 4; // inteiro (menor)
		byte num3 = 4;
		
		// Tipos não primários/primitivos
		Long num7 = (long) 99999; // Cast!!
		Integer num4 = 98;
		Short num5 = 7;
		Byte num6 = 9;

		System.out.println("Imprimindo números");
		System.out.println("int -> Num1 = " + num1);
		System.out.println("short -> Num2 = " + num2);
		System.out.println("byte -> Num3 = " + num3);
		System.out.println("Integer -> Num4 = " + num4);
		System.out.println("Short -> Num5 = " + num5);
		System.out.println("Byte -> Num6 = " + num6);
		
		System.out.println("Memória");
		System.out.println("int/integer " + Integer.SIZE + " bits");
		System.out.println("short/Short " + Short.SIZE + " bits");
		System.out.println("byte/Byte " + Byte.SIZE + " bits");
		
		System.out.println("Mínimos e máximos");
		System.out.println("Valor Min int/integer " + Integer.MIN_VALUE);
		System.out.println("Valor Max int/integer " + Integer.MIN_VALUE);
		System.out.println("Valor Min short/Short " + Short.MIN_VALUE);
		System.out.println("Valor Max short/Short " + Short.MIN_VALUE);
		System.out.println("Valor Min byte/Byte " + Byte.MIN_VALUE);
		System.out.println("Valor Max byte/Byte " + Byte.MIN_VALUE);
	}
}
