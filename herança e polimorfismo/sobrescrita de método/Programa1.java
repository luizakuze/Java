package Luiza;

// Sobrescrita de Método

/*
- Overriding

É o ato de sobrescrevermos os métodos da classe mãe em classes filhas.
 */
public class Programa1 {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa ();
		
		// OVERLOADING!! Sobrecarga de Método
		p1.mensagem();

		// OVERLOADING!! Sobrecarga de Método
		p1.mensagem("Mensagem diferente...");

	}

}
