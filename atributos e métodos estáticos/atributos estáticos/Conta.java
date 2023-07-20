package Luiza;

public class Conta {
	private int numero;
	private String cliente;
	
	// atributo estático
	public static int contador = 1;
	
	public Conta(String cliente) {
		this.numero = contador;
		this.cliente = cliente;
		
		//Conta.contador = Conta.contador + 1;
		//this.contador = this.contador + 1; Aqui acessa ele sem a forma estática
		// funciona, mas não é recomendável acessar um atributo estático dessa forma.
		Conta.contador += 1;

	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public String getCliente() {
		return this.cliente;
	}
}
