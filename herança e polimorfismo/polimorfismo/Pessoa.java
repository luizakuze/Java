package Luiza;

/*
- Classe base;
- Classe mãe/pai;
- Super classe;
- Classe genérica.
 */

public class Pessoa {
	// Privado, encapsular
	private String nome;
	private int anoNascimento;
	private String email;
	
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
}
