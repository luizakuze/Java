package Luiza;

// Software para o time gerenciar o seu treinamento

// Template Method

/*
- Final é um modificador de acesso que faz com que o elemento
  que o esteja utilizando, não possa ser extendido/reescrito.
  
  
 */
public abstract class Treinamento {

	//Template Method
	public final void treinoDiario() {
		preparoFisico();
		jogoTreino();
		treinoTatico();
	}
	
	public abstract void preparoFisico();
	
	public abstract void jogoTreino();
	
	// Esse método vai se manter dessa forma sempre! 'FINAL'
	public final void treinoTatico() {
		System.out.println("Treino Tático...");
	}
}
