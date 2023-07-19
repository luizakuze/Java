package Luiza;

/*
**** Classe Abstrata ****
Dessa forma, impossibilitamos a criação de objetos dessa classe
 
Uma classe abstrata pode ter:
- atributos;
- métodos;
- métodos abstratos;


**** Métodos Abstratos ****
- São métodos que não possuem implementação, possuem apenas
  declaração, e, obrigatoriamente as classes que herdam dessa 
  classe com métodos abstratos, precisam implementar estes métodos.
 */

// Classe abstrata
public abstract class Pessoa {
	private String nome;
	private int anoNascimento;
	private String email;
	
	public Pessoa() {}
	
	// Construtor 
	public Pessoa(String nome, int anoNascimento, String email) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.email = email;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String Nomes) {
		this.nome = nome;
	}
	
	public int anoNascimento() {
		return this.anoNascimento;
	}
	
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "Nome: " + this.nome + " Ano Nascimento: " + this.anoNascimento;
	}
	
	public void mensagem() {
		System.out.println("Esta é a minha mensagem!");
	}	
	
	public void mensagem(String msg) {
		System.out.println(msg);
	}
	
	// Declaração de um método abstrato
	// (Outra classe filha DEVE fazer a implementação dessa declaração)
	// Deve terminar com ';' !!!
	public abstract void outraMensagem(String texto); 
}
