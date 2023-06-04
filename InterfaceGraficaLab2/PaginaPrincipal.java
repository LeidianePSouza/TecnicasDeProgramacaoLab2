package InterfaceGraficaLab2;

import javax.swing.JFrame;
import javax.swing.JPanel;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.ActiveEvent;

import javax.swing.JButton;

public class PaginaPrincipal extends JFrame{
//	 implements ActionListener

	public PaginaPrincipal() {
		
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
//			add(botao("Cadastrar", Color.blue));

			painel1.add(botao2);
//			add(botao("Listar", Color.blue));
			
			painel1.add(botao3);
//			add(botao("Atualizar", Color.blue));
			
			painel1.add(botao4);
//			add(botao("Deletar", Color.blue));
		
		this.add(painel1, BorderLayout.NORTH);
		this.add(painel2, BorderLayout.SOUTH);

		
		this.setTitle("Tela");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
	}
	
//	public Botao botao(String texto, Color cor) {
//		Botao b = new Botao(texto, cor);
//		b.addActionListener(this);
//		
//		return b;
//	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//        JButton b = (JButton) e.getSource();
//		
//	}

}
