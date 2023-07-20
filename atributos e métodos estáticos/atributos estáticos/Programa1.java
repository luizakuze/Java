package Luiza;

/*
Atributos est�ticos

Atributos est�ticos s�o atributos, onde os valores s�o compartilhados
entre as inst�ncias da classe.

 */

public class Programa1 {

	public static void main(String[] args) {
		Conta c1 = new Conta("Luiza");
		System.out.println(c1.getNumero());
		System.out.println(c1.getCliente());
		
		Conta c2 = new Conta("Luana");
		System.out.println(c2.getNumero());
		System.out.println(c2.getCliente());
		
	}
	
}
