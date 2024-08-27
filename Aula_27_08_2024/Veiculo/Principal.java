package veiculo_27_08_2024;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro meuCarro = new Carro(); //objeto
		Carro meuCarro2 = new Carro();
		
		
		meuCarro.modelo = "SUV";
		meuCarro.cor = "Azul";
		meuCarro.ano = 2021;
		
		meuCarro2.modelo = "Sedan";
		meuCarro2.cor = "Vermelho";
		meuCarro2.ano = 2020;
		meuCarro2.placa = "AAAA-2304";
		
		meuCarro.exibirInformacoes();
		meuCarro2.exibirInformacoes();

	}

}
