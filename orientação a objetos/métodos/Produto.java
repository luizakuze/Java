package Luiza;

// Métodos

/*
- Podemos entender os métodos como a ação que é realizada por um objeto da classe;
- Ppodemos entender também que os métodos são comportamentos dos objetos da classe;

- Mesmos requisitos para as funções:
a) Tipo de retorno;
b) Nome;
c) Parâmetros (opcional);
d) Retorno (opcional);
*/

public class Produto {
	String nome;
	float preco;
	float desconto;
	
	// Método para aumentar o preço do projeto de acordo com o valor
	void aumentarPreco(float valor) {
		this.preco = this.preco + valor;
	}
}
