package m1_17_09_2024;

public class Carro {
	public String modelo;
	private double preco;
	double quilometragem;

	
	public Carro(String modelo, double preco, double quilometragem) {
		this.modelo = modelo;
		this.preco = preco;
		this.quilometragem = quilometragem;
	}
	
	public void exibirPreco() {
		System.out.println("Preço do carro: " + preco);
	}
	
	public void exibir() {
		System.out.println("Modelo: " + modelo);
	}
	
	
	
}
