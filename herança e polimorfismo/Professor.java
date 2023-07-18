package Luiza;

public class Professor extends Pessoa {
	private String matricula;
	
	public Professor(String nome, int anoNascimento, String email, String amtricula) {
		super(nome, anoNascimento, email);
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}
