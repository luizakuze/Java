package Luiza;

// Instrução Switch
public class Switch {

	public static void main(String[] args) {
		int numero = 2;
		
		switch (numero) {
			case 0:
				System.out.println("O número é zero");
				break;
			case 1:
				System.out.println("O número é um");
				break;
			case 2:
				System.out.println("O número é dois");
				// break;
			default:
				System.out.println("O número não é zero ou um");
				break;
			}
		
	}
}
