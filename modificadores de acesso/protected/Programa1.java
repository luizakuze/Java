package Luiza;

public class Programa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cli1 = new Cliente("Luiza", "Rua do Mar");
		
		System.out.println("Nome: " + cli1.getNome());
		System.out.println("Endereço: " + cli1.getEndereco());
		cli1.dizerOi();
		
		// sem acesso, é private.
		//cli1.dizerOi();
		
		Cliente cli2 = new Cliente("Luana", "Rua do Sol");
		
		System.out.println("Nome: " + cli2.getNome());
		System.out.println("Endereço: " + cli2.getEndereco());
		cli2.dizerOi();
	}

}
