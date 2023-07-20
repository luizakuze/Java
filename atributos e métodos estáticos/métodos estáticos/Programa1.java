package Luiza;

/*
Métodos estáticos

Um método estático não depende de uma instância da classe
para ser utilizado.

Pode-se utilizar conforme:

NomeDaClasse.metodo();

Conta.getNumero() ??
Conta.contador = 42 -> Funcionava p atributo estático
 */

public class Programa1 {

	public static void main(String[] args) {
		
		Conta c1 = new Conta ("Cliente1");
		System.out.println("Número: " + c1.getNumero());
		System.out.println("Cliente: "+ c1.getCliente());;
		
		// método estático: nome da classe junto ao atributo
		System.out.println("A próxima conta será: " + Conta.proximaConta());
		
	}
	
}
