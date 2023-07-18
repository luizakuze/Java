package Luiza;

/* Benefícios da Herança

- Evita a repetição de código;
- Facilita a manutenção do programa;
- ...

- Classe específica;
- Sub-classe;
- Classe filha.

 */


// O aluno é uma Pessoa!

/*
Quando uma classe herda de outra classe ela ganha:
- TODOS os atributos e métodos da classe mãe
 */
public class Aluno extends Pessoa{
	private String nome;
	private int anoNascimento;
	private String ra;
	
	public Aluno(String nome, int anoNascimento, String email, String ra) {
	//	this.nome = nome;
	//	this.anoNascimento = anoNascimento;
		super(nome, anoNascimento, email);
		this.ra = ra;
	}
	
	//public String getNome() {
	//	return this.nome;
	//}
	
	//public void setNome(String nome) {
	//	this.nome = nome;
	//}
	
	//public int getAnoNascimento() {
	//	return this.anoNascimento;
	//}
	
	//public void setAnoNascimento(int anoNascimento) {
	//	this.anoNascimento = anoNascimento;
	//}
	
	public String getRa() {
		return this.ra;
	}
	
	public void setRa(String ra) {
		this.ra = ra;
	}
}
