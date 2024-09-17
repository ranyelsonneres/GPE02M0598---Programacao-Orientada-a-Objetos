package m2_17_09_2024;

import m1_17_09_2024.Carro;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro meuCarro = new Carro("Fusca", 10000, 20);
		
		meuCarro.exibir();
		
		//System.out.println("Preco: " + meuCarro.preco);
		
		//meuCarro.quilometragem = 10;
		
		meuCarro.exibirPreco();
		

	}

}
