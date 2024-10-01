package heranca;

public class Professor extends Pessoa {
	
	private String disciplina;

	public Professor(String nome, int idade, String disciplina) {
		super(nome, idade);
		this.disciplina = disciplina;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	//metodo sobrescrito
	@Override
	public void apresentar() {
		super.apresentar();
		System.out.println("Disciplina: " + disciplina);
	}
	
	@Override
	public String toString() {
		//return "Disciplina: " + disciplina;
		return super.toString() + ", Disciplina: " + disciplina;
	}
	

}
