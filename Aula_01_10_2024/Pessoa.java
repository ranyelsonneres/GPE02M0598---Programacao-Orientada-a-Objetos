package heranca;

public class Pessoa {
	
	//atributos
	protected String nome;
	protected int idade;
	

	//construtor
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	//getters e setters
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//método 
	public void apresentar() {
		System.out.println("Nome: " + nome + " Idade: " + idade);
	}
	
	//metodo que não pode ser herdado
//	public final void apresentar() {
//		System.out.println("Nome: " + nome + " Idade: " + idade);
//	}
	
	@Override
	public String toString() {
		return "Nome: " + nome +
				" Idade: " + idade;
	}
	
}
