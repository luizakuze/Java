package Luiza;

// Protected

// É o modificador de acesso default (padrão)
// se não colocar public ou private, vai ser protected

/*
- O modificador de acesso Protected faz com que
  o elemento seja visível somente dentro do mesmo
  pacote onde o elemento foi declarado.
  
 */

public class Cliente {
		private String nome;
		private String endereco;
		
		public Cliente(String nome, String endereco) {
			this.nome = nome;
			this.endereco = endereco;
		}
		
		// !!!
		protected void dizerOi() {
			System.out.println(this.nome + " está dizendo oi.");
		}
		
		public String getNome() {
			return this.nome;
		}
		
		public String getEndereco() {
			return this.endereco;
		}
}
