package Luiza;

// Template Method

/*
- O padrão Template Method define o esqueleto de um algoritmo dentro de um método,
transferindo alguns de seus passos para as subclasses. O Template Method permite
que as subclasses redefinam certos passos de um algoritmo sem alterar a estrutura
do próprio algoritmo.

Algoritmos são "receitas" passo-a-passo para resolver algum problema.

receber numero;
retornar numero * numero;

metodoPrincipal() {
	passo1();
	passo2();
	passo3();
}

*/
public class Programa1 {

	public static void main(String[] args) {
		TrainamentoInicioDaTemporada luiza = new TrainamentoInicioDaTemporada();
		
		luiza.treinoDiario();
		
		TreinamentoFimDaTemporada luana = new TreinamentoFimDaTemporada();
		
		luana.treinoDiario();
	}
	
}
