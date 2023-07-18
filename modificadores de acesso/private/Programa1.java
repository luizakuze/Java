package Luiza;

// Private

/*
 * Privado à própria classe.
 * 
 * Ou seja, só temos acesso ao atributo ou método privado
 * dentro da própria classe onde foi declarado
 */
public class Programa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cli1 = new Cliente("Luiza", "Rua do Mar");
		
		System.out.println("Nome: " + cli1.getNome());
		System.out.println("Endereço: " + cli1.getEndereco());
		
		// sem acesso, é private.
		//cli1.dizerOi();
		
		Cliente cli2 = new Cliente("Luana", "Rua do Sol");
		
		System.out.println("Nome: " + cli2.getNome());
		System.out.println("Endereço: " + cli2.getEndereco());
	}

}
