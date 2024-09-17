package funcionario;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Criar um objeto Funcionario
        Funcionario funcionario = new Funcionario();

        // Ler os dados do funcionário
        System.out.print("Digite o nome do funcionário: ");
        funcionario.nome = scanner.nextLine();

        System.out.print("Digite o salário do funcionário: R$ ");
        funcionario.salario = scanner.nextDouble();
        
        System.out.println("Dados do funcionário antes de aplicar o aumento:");
        funcionario.exibirDados();

        // Aplicar aumento e mostrar os dados atualizados
        double salarioAtualizado = funcionario.aplicarAumento(); // Recebe o novo salário
        System.out.println("\nDados do funcionário após aplicar aumento:");
        funcionario.exibirDados();
        System.out.println("Salário Atualizado: R$ " + salarioAtualizado); // Exibe o novo salário

        scanner.close();

	}

}
