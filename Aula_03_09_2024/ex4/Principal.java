package estudante;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Estudante aluno = new Estudante();
		
		//Leitura do nome do aluno
		System.out.println("Nome do aluno: ");
		aluno.nome = sc.nextLine();
		
		//Leitura das notas
		double n1, n2, n3, somaNota;
		System.out.println("Primeiro trimestre (0 a 30):");
		n1 = sc.nextDouble();
		
		while (n1 < 0 || n1 > 30) {
			System.out.println("Nota invalida, insira outra nota: ");
			n1 = sc.nextDouble();
		}
		
		System.out.println("Segundo trimestre (0 a 35):");
		n2 = sc.nextDouble();
		
		while (n2 < 0 || n2 > 35) {
			System.out.println("Nota invalida, insira outra nota: ");
			n2 = sc.nextDouble();
		}
		
		System.out.println("Terceiro trimestre (0 a 35):");
		n3 = sc.nextDouble();
		
		while(n3 < 0 || n3 > 35) {
			System.out.println("Nota invalida, insira outra nota: ");
			n3 = sc.nextDouble();
		}
		
		
		aluno.nota1 = n1;
		aluno.nota2 = n2;
		aluno.nota3 = n3;
		
		
		somaNota = aluno.calcularNotas();
		System.out.println("Nota final: " + aluno.calcularNotas());
		System.out.println("Status: " + aluno.resultado(somaNota));
		
		sc.close();

	}

}
