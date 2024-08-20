import javax.swing.JOptionPane;

public class Aula_20_08_2024_2 {

	public static void main(String[] args) {
		// joptionpane
		//String nome = JOptionPane.showInputDialog("Nome: ");
		
		//JOptionPane.showMessageDialog(null, "Seu nome é: " + nome);
		
		//dados de entrada
		String entrada1 = JOptionPane.showInputDialog("N1: ");
		String entrada2 = JOptionPane.showInputDialog("N2: ");;
		
		//a conversão
		int num1 = Integer.parseInt(entrada1);
		int num2 = Integer.parseInt(entrada2);
		
		int soma = num1 + num2;
		
		
		
		//impressão (saída)
		JOptionPane.showMessageDialog(null, soma);

	}

}
