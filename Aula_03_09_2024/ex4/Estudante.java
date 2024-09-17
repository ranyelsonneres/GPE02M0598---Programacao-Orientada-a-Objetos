package estudante;

public class Estudante {
	
	String nome;
	double nota1;
	double nota2;
	double nota3;
	

	//calcular a nota
	public double calcularNotas() {
		return (nota1 + nota2 + nota3);
	}
	
	
	
	//apresentar o resultado
	public String resultado(double nota) {
		if (nota >=70) {
			return "Aprovado";
		}else {
			double pontosFaltando = 70 - nota;
			return "Reprovado. Pontos faltando para aprovação: " + pontosFaltando;
		}
	}

}
