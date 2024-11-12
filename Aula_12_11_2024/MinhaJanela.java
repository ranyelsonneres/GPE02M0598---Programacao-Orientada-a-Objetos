package interface_grafica;

import javax.swing.*;

public class MinhaJanela extends JFrame{
	
	
	public MinhaJanela() {
		
		setSize(500, 400); //tamanho
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); //posição
		setResizable(false); //desativa o redimensionamento da janela
		setLayout(null);
		inicializarComponentes();
		
	}
	//criar um método
	public void inicializarComponentes(){
		//criar o botão
				JButton jButton = new JButton("Botão 1");
				jButton.setBounds(30, 50, 200, 50);
				add(jButton);
				
				//criar um evento
				jButton.addActionListener(e -> {
					JOptionPane.showMessageDialog(null, "Seja bem-vindo!");
				});
	}
}
