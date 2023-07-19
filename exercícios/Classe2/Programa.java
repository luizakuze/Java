package Luiza;

/* Com base no exercício "Classe", crie um novo construtor na classe PessoaE que permite criar 
objetos sem definir seus atributos junto com a declaração. */

public class Programa {

	public static void main(String[] args) {
		PessoaE pessoa = new PessoaE("Luiza", "Rua do Céu", "1234-5678");
		pessoa.imprime();
		
		PessoaE pessoa2 = new PessoaE();
		pessoa2.setNome("Luana");
		pessoa2.imprime();
		

	}

}
