package Luiza;

// Classses abstratas

/*
- É um recurso que proporciona um bloqueio na criação de objetos;
- Não é possível instanciar objetos da classe abstrata
- É uma proteção da classe
- Geralmente são as super-classes
 * 
 */
public class Programa1 {

	public static void main(String[] args) {
		//"Cannot instantiate the type Pessoa"
		//Pessoa luiza = new Pessoa("Luiza", 2020, "lulu@gmail.com");
		//System.out.println(luiza);
		
		Aluno luana = new Aluno("Luana", 2021, "luana@gmail.com.br", "ABCD");
		System.out.println(luana);
		
		luana.outraMensagem("Nome " + luana.getNome());
		
	}

}
