package Luiza;

// Construtor

/*
- Sempre um construtor vazio tem a seguinte forma:

  public NomeDaClasse(){}
*/

public class Pessoa {
	String nome, email;
	int anoNascimento;
	
	// Construtor vazio
	// Se comentar essa linha do construtor dá erro! Pois existe um construtor com parâmetros tbm
	public Pessoa() {}
	
	// Construtor com parâmetros
	public Pessoa(String nome, String email, int anoNascimento) {
		this.nome = nome; // this.Objeto = "nesse objeto, faça tal coisa"
		this.email = email;
		this.anoNascimento = anoNascimento;
	}
	
	void imprimeInformacoes() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Email: " + this.email);
		System.out.println("Ano de Nascimento: " + this.anoNascimento);

	}
}
