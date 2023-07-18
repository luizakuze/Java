package Luiza;

// Encapsulamente
// Capsula
// Os clientes não podem ter acesso direto aos atributos diretamente!


public class Programa {
	
	public static void main(String[] args) {
		Cliente luiza = new Cliente("Luiza Kuze", "Rua do Céu, 45");
		Cliente maria = new Cliente("Maria Luana", "Rua do Céu, 45");
		
		Conta conta_luiza = new Conta(1, 100.0f, 200.0f, luiza);
		Conta conta_maria = new Conta(2, 300.0f, 500.0f, maria);
		
		System.out.println("Saldo da Luiza: (Antes do saque) " + conta_luiza.getSaldo());
		System.out.println("Saldo da Maria: " + conta_maria.getSaldo());
		
		conta_luiza.sacar(150);
		System.out.println("Saldo da Luiza: (Depois do saque) " + conta_luiza.getSaldo());
		
		//conta_luiza.limite = 100.000f;
		//system.out.println("Saldo da Luiza: (Depois do aumentar o limite forçado) " + conta_luiza.getSaldo());
		
		//conta_luiza.saldo = -9000; Encapsulamento!! 
		//System.out.println("Saldo da Luiza: (Depois do saque forçado) " + conta_luiza.saldo);
	}
}
