package imc_27_08_2024;

public class CalculadoraIMC {

	//atributos
	double altura;
	double peso;
	
	
	//métodos
	//calcular IMC
	public double calcularIMC() {
		return peso / (altura * altura);
	}
	
	
	//interpretar
	public String interpretarIMC(double imc) {
		if (imc < 18.5) {
			return "Abaixo do peso";
		} else if (imc < 24.9) {
			return "Peso normal";
		} else if (imc < 29.9) {
			return "Sobrepeso";
		} else {
			return "obesidade";
		}
	}
}
