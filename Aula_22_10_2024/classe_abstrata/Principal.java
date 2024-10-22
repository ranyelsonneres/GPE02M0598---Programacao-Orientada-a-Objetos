package abstrato;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Jogo jogo = new Jogo("Uno", 4); classe abstrata
		
		
		Jogo jogo1 = new JogoCartas("Uno", 4, "Padrão");
		
		jogo1.iniciar();
		jogo1.regras();
		
		System.out.println();
		
		Jogo jogo2 = new JogoTabuleiro("Banco Imobiliario", 4, "Quadrado");
		jogo2.iniciar();
		jogo2.regras();
	}
	

}
