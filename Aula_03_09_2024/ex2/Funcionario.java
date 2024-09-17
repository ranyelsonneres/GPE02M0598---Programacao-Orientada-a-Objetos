package funcionario;

public class Funcionario {
	
	String nome;
    double salario;
    
    public double aplicarAumento() {
    	if (salario >= 1 && salario <= 1000) {
            salario += salario * 0.15; // Aumento de 15%
        } else if (salario >= 1001 && salario <= 1500) {
            salario += salario * 0.10; // Aumento de 10%
        } else if (salario >= 1501 && salario <= 2000) {
            salario += salario * 0.05; // Aumento de 5%
        } else {
            System.out.println("Salário fora das faixas de aumento estabelecidas.");
        }
        return salario; // Retorna o novo salário
    }
    
 // Método para exibir os dados do funcionário
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
    }
    

}
