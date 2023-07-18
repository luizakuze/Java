package Luiza;

// Polimorfismo

public class Programa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa ("Luiza", 1987, "luiza@gmail.com");		
		System.out.println(p1.getNome());
		System.out.println(p1);
		System.out.println(p1.toString());
		
		
		Aluno a1 = new Aluno ("Luana", 2020, "lulu@gmail.com", "12345");
		System.out.println(a1.getNome());
		System.out.println(a1);
		System.out.println(a1.toString());
		
		Professor prof1 = new Professor ("Pedro", 1980, "pedro@hotmail.com", "ABCDE");
		System.out.println(prof1.getNome());
		System.out.println(prof1);
		System.out.println(prof1.toString());
	}

}
