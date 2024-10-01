package heranca;

public class Principal{

	public static void main(String[] args) {
		
		Professor professor = new Professor("Maria", 32, "Artes");
		Aluno aluno = new Aluno("João", 20, "Cinema");
		Pessoa pessoa = new Pessoa("Ana", 25);
		
		professor.apresentar();
		aluno.apresentar();
		
		professor.idade = 35;
		
		professor.apresentar();
		
		System.out.println(pessoa);
	}

}
