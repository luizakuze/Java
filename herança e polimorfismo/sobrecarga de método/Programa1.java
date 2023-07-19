package Luiza;

// Sobrecarga de Método

/*
- Overloading

Ocorre quando sobrescrevemos um método na mesma classe de declaração.

 */
public class Programa1 {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa ();
		
		p1.mensagem();
		
		p1.mensagem("Mensagem diferente...");

	}

}
