package Luiza;

// Instru��o Switch
public class Switch {

	public static void main(String[] args) {
		int numero = 2;
		
		switch (numero) {
			case 0:
				System.out.println("O n�mero � zero");
				break;
			case 1:
				System.out.println("O n�mero � um");
				break;
			case 2:
				System.out.println("O n�mero � dois");
				// break;
			default:
				System.out.println("O n�mero n�o � zero ou um");
				break;
			}
		
	}
}
