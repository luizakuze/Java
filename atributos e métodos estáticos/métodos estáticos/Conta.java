package Luiza;

public class Conta {
	private int numero;
	private String cliente;
	
	// atributo est�tico
	public static int contador = 1;
	
	public Conta(String cliente) {
		this.numero = contador;
		this.cliente = cliente;
		
		//Conta.contador = Conta.contador + 1;
		//this.contador = this.contador + 1; Aqui acessa ele sem a forma est�tica
		// funciona, mas n�o � recomend�vel acessar um atributo est�tico dessa forma.
		Conta.contador += 1;

	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public String getCliente() {
		return this.cliente;
	}
	
	public static int proximaConta() {
		return Conta.contador;
	}
}
