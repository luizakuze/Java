package Luiza;

// Declaração da classe
public class PessoaE {
	
	// Atributos
	private String nome;
	private String endereco;
	private String telefone;
	
	// Construtos padrão
	public PessoaE () {
		this.nome = "Nome não informado";
		this.endereco = "Endereço não informado";
		this.telefone = "Telefone não informado";
	}
	
	// Construtor vazio
	public PessoaE (String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
		
	// Métodos
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return this.endereco;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void imprime() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Endereço: " + this.endereco);
		System.out.println("Telefone: " + this.telefone);
	}

}
