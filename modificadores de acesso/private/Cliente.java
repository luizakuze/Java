package Luiza;

public class Cliente {
		private String nome;
		private String endereco;
		
		public Cliente(String nome, String endereco) {
			this.nome = nome;
			this.endereco = endereco;
			
			this.dizerOi();
		}
		
		private void dizerOi() {
			System.out.println(this.nome + " está dizendo oi.");
		}
		
		public String getNome() {
			return this.nome;
		}
		
		public String getEndereco() {
			return this.endereco;
		}
}
