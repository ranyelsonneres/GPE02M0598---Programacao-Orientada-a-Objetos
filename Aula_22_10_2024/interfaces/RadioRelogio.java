package interfaces;

public class RadioRelogio  implements Radio, Relogio{
	
	boolean ligado;
	double estacaoAtual;

	
	public RadioRelogio() {
		this.ligado = false;
		this.estacaoAtual = 0.0;
	}


	//interface Radio
	public void ligar() {
		ligado = true;
		System.out.println("Ligado!!");
	}
	
	public void desligar() {
		ligado = false;
		System.out.println("Desligado!!");
	}
	
	public void estacao(double estacaoAtual) {
		this.estacaoAtual = estacaoAtual;
	}
	
	//interface Relogio
	public String horas() {
		java.time.LocalTime agora = java.time.LocalTime.now();
		return agora.toString();
	}
	
	//metodo da classe
	public double obterEstacaoAtual() {
		return estacaoAtual;
	}
}
