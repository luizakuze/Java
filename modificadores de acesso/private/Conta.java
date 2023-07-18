package Luiza;
/*
Getters e Setters

Getter
- � um m�todo p�blico, que serve para consultar dados;
- A nomenclatura desses m�todos � getNome_do_atributo()

obs: Ser "public" significa que eu tenho acesso em todo o projeto.
	 O "private" torna privado para a pr�pria classe.

 */

public class Conta {
	private int numero;
	private float saldo; // encapsulamento
	private float limite; 
	private Cliente cliente;
	 
	public Conta(int numero, float saldo, float limite, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
	}
	
	public void sacar(float valor) {
		if (valor <= this.saldo) {
			this.saldo = this.saldo - valor;
		} else if (valor <= (this.saldo + this.limite)){
			// Calculando o valor excedente do saque
			float aux = this.saldo - valor;
			if (aux < 0) {
				this.saldo = 0;
			}
			aux = this.limite + aux;
			this.limite = aux;
		} else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}
	
	// M�todo getter do atributo Saldo
	public float getSaldo() {
		return this.saldo + this.limite;
	}
	
	// public float getLimite (...)
	// N�o � necess�rio j� que n�o usamos o acesso dele em nenhum momento diretamente alterando ele
}
