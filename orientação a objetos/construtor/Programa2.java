package Luiza;

// Construtor

/*
- O construtor de uma classe SEMPRE tem o mesmo nome da classe;
- Por padrão a JVM - Java Virtual Machine, cria em tempo de execução,
  um construtor padrão - um construtor vazio;
- Podemos ter mais de um construtor na classe;
 */
public class Programa2 {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa(); // (Método) Construtor
		
		pessoa1.nome = "Luiza";
		pessoa1.email = "luiza@gmail.com";
		pessoa1.anoNascimento = 2004;
		
		System.out.println("Nome: " + pessoa1.nome);
		System.out.println("Email: " + pessoa1.email);
		System.out.println("Ano de Nascimento: " + pessoa1.anoNascimento);

		// Construtor com parâmetros
		Pessoa pessoa2 = new Pessoa("Luana", "luana@gmail.com", 2002);
		
		//System.out.println("Nome: " + pessoa2.nome);
		//System.out.println("Email: " + pessoa2.email);
		//System.out.println("Ano de Nascimento: " + pessoa2.anoNascimento);

		pessoa2.imprimeInformacoes();
	}

}
