package Luiza;

/*
Uma interface pode conter:
- Constantes (vari�vel com valor que N�O pode ser alterado).
  Geralmente uma constante tem todos os caracteres em caixa alta.
- M�todos abstratos. 


Interface para servir de contrato para produtos eletr�nicos.
Todo produto eletr�nico que implementar essa interface OBRIGATORIAMENTE
dever� implementar os m�todos abstratos.
 */
public interface IEletronico {
	
	// Constante
	public String MARCA = "Lu";
	
	public void ligar();
	
	public void desligar();
	
	// N�o pode criar um m�todo implementado na interface!
	//public String mensagem() {
	//	return "Mensagem";
	//}
}
