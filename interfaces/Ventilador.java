package Luiza;

public class Ventilador implements IEletronico {
	private boolean ligado = false;
	
	public void ligar() {
		if (!this.ligado) {
			this.ligado = true;
			System.out.println("Ligado!");
		}
	}

	public void desligar() {
		if (this.ligado) {
			this.ligado = false;
			System.out.println("Desligado!");
		}
	}
	
}
