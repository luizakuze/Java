package Luiza;

// Objetos

/*
- Objetos são produtos/instâncias da classe;
*/

public class Programa {

	public static void main(String[] args) {
		int numero = 4;
		
		// Declaração de um objeto
		Produto p0;
		
		// Declaração e instanciação/inicialização do objeto
		// p1 -> instância do objeto / objeto
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 2.367f;
		p1.desconto = 15.0f;
		
		System.out.println("---- Produto 1 ----");
		System.out.println(p1.nome);
		System.out.println("R$" + p1.preco);
		System.out.println(p1.desconto + '%');
		
		// Inicializando o objeto p0
		p0 = new Produto();
		p0.nome = "Caneta";
		p0.preco = 2.34f;
		p0.desconto = 5;
		
		System.out.println("---- Produto 0 ----");
		System.out.println(p0.nome);
		System.out.println("R$" + p0.preco);
		System.out.println(p0.desconto + '%');
		
		// Declarando e inicializando um objeto Pessoa
		Pessoa pessoa = new Pessoa();
		pessoa.nome = "Luiza";
		pessoa.email  = "luizakuze08@gmail.com";
		pessoa.anoNascimento = 2004;
		
		System.out.println("---- Pessoa ----");
		System.out.println(pessoa.nome);
		System.out.println(pessoa.email);
		System.out.println(pessoa.anoNascimento);
		
	}		
		
}		
	
