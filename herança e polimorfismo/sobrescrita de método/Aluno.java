package Luiza;

public class Aluno extends Pessoa{
	private String nome;
	private int anoNascimento;
	private String ra;
	
	public Aluno(String nome, int anoNascimento, String email, String ra) {
		super(nome, anoNascimento, email);
		this.ra = ra;
	}
	
	public String getRa() {
		return this.ra;
	}
	
	public void setRa(String ra) {
		this.ra = ra;
	}

	// OVERRIDING!! / Sobrescrita de método
	public String toString() {
		return super.toString() + " Ra: " + this.ra;
	}

	// OVERRIDING!! / Sobrescrita de método
	public String getNome() {
		return "Aluno: " + super.getNome();
	}
}
