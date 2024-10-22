package interfaces;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RadioRelogio r = new RadioRelogio();
		
		r.ligar();
		//r.desligar();
		
		System.out.println("Hora: " + r.horas());
		
		//coloca uma estação para o radio
		r.estacao(101.5);
		System.out.println("Estação: " + r.obterEstacaoAtual());
		
		System.out.println();
		r.desligar();

	}

}
