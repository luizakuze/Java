package Luiza;

public class Pessoa {
	// Privado, encapsular
	private String nome;
	private int anoNascimento;
	private String email;
	
	// OVERLOADING
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
	
	// setar o valor
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
		return "Nome: " + this.nome + " Ano Nascimento :" + this.anoNascimento;
	}
	
	public void mensagem() {
		System.out.println("Esta é a minha mensagem!");
	}	
	
	public void mensagem(String msg) {
		System.out.println(msg);
	}
}
