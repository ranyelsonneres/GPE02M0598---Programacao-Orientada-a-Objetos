package calculadora_27_08_2024;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//chamar o objeto
		Calculadora calc = new Calculadora();
		
		System.out.println("Num 1: ");
		calc.num1 = sc.nextDouble();
		
		System.out.println("Num 2: ");
		calc.num2 = sc.nextDouble();
		
		System.out.println("Soma: " + calc.somar());
		System.out.println("Subtração: " + calc.subtrair());		
		
		sc.close();

	}

}
