package triangulo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
	
		System.out.println("Medida do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Medida do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		//calculo das áreas:
		double areax = x.area();
		double areay = y.area();
		
		//áreas do triangulo:
		System.out.println("Área do triângulo X: " + areax);
		System.out.println("Área do triângulo Y: " + areay);
				

		String resultado = Triangulo.comparar(areax, areay);
		System.out.println(resultado);
		
		sc.close();

	}

}
