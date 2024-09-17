package metodos_get_set_17_09_2024;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jogo jogo = new Jogo("F1", 200, "Xbox");
		
		jogo.setNome("F1-2025");
		jogo.setPreco(-1);
		
		System.out.println("Nome: " + jogo.getNome());

	}

}
