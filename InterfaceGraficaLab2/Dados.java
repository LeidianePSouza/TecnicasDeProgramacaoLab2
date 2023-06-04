package InterfaceGraficaLab2;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Dados extends JFrame {
	public Dados() {

		this.setSize(600, 500);
		
		JPanel painel1 = new JPanel();
		painel1.setBackground(Color.LIGHT_GRAY);
		
		JPanel painel2 = new JPanel();
		painel2.setBackground(Color.LIGHT_GRAY);
		
		JButton botao1 = new JButton("Cadastrar");
		JButton botao2 = new JButton("Listar");
		JButton botao3 = new JButton("Atualizar");		
		JButton botao4 = new JButton("Deletar");
		
		painel1.add(botao1);
		painel1.add(botao2);	
		painel1.add(botao3);	
		painel1.add(botao4);
		
		
		this.add(painel1, BorderLayout.NORTH);
		this.add(painel2, BorderLayout.SOUTH);

		
		this.setTitle("Dados");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
}
	
}
