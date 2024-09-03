package imc_27_08_2024;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scanner
		Scanner sc = new Scanner(System.in);
		
		//objeto
		CalculadoraIMC calc = new CalculadoraIMC();
		
		//passar os dados de leitura
		System.out.println("Peso: ");
		calc.peso = sc.nextDouble();
		
		System.out.println("Altura: ");
		calc.altura = sc.nextDouble();
		
		//calcular o IMC
		double imc = calc.calcularIMC();
		
		
		//resultado
		String resultadoIMC = calc.interpretarIMC(imc);
		
		System.out.println("IMC: " + imc);
		System.out.println("Classificacao: " + resultadoIMC);
		
		sc.close();

	}

}
