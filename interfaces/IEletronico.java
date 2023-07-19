package Luiza;

/*
Uma interface pode conter:
- Constantes (variável com valor que NÃO pode ser alterado).
  Geralmente uma constante tem todos os caracteres em caixa alta.
- Métodos abstratos. 


Interface para servir de contrato para produtos eletrônicos.
Todo produto eletrônico que implementar essa interface OBRIGATORIAMENTE
deverá implementar os métodos abstratos.
 */
public interface IEletronico {
	
	// Constante
	public String MARCA = "Lu";
	
	public void ligar();
	
	public void desligar();
	
	// Não pode criar um método implementado na interface!
	//public String mensagem() {
	//	return "Mensagem";
	//}
}
