package abstrato;

public class JogoTabuleiro extends Jogo {
	String tipoTabuleiro;

	public JogoTabuleiro(String nome, int nJogadores, String tipoTabuleiro) {
		super(nome, nJogadores);
		this.tipoTabuleiro = tipoTabuleiro;
	}

	public void iniciar() {
		System.out.println("Jogo: " + super.nome);
	}
	
	public void regras() {
		System.out.println("Cada jogador deve mover suas peças");
	}
	
	
}
