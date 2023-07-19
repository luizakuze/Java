package Luiza;

// Interfaces 

/*
- Interface são conhecidas como "contratos".

Uma empresa criou um contrato 'com regras' para definir
a criação de um produto/serviço.

Quem implementar esse contrario é OBRIGADO a seguir as regras!

Luana decidiu implementar (criar) um produto/serviço baseado nesse contrato.
Luiza também decidiu implementar (criar) um produto/serviço baseado no mesmo contrato.

Contrato para a confecção de um bolo
	- O bolo precisa ser de chocolate;
	- O bolo deve ter cobertura;
	- O bolo deve ser recheado;
		
Diferença de Classe Abstrata para Interface
- Interface: Constantes e Métodos Abstratos
- Classe Abstrata: Constante, atributos normais, variáveis e métodos e pode implementar métodos.
*/
public class Programa {

	public static void main(String[] args) {
		Ventilador vent = new Ventilador();
		
		System.out.println("A marca do ventilador é " + vent.MARCA);
		
		vent.desligar(); // Não deve imprimir a mensagem! 
		
		vent.ligar(); // Deve imprimir a mensagem
		
		vent.desligar();  // Deve imprimir a mensagem
	}
	
}
