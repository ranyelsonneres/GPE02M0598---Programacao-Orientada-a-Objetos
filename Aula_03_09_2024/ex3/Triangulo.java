package triangulo;

public class Triangulo {
	
	double a;
	double b;
	double c;
	
	//método calcular área do triangulo
	public double area () {
		double p = (a + b + c)/2.0;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	
	//método para comparar as áreas do triangulo
	public static String comparar(double areax, double areay) {
		if (areax > areay) {
			return "Triangulo X tem a maior área";
		} else if (areay > areax) {
			return "Triangulo Y tem a maior área";
		} else {
			return "Os dois triangulos têm a mesma área";
		}
		
	}
	
	

}
