package InterfaceGraficaLab2;

import javax.swing.JButton;
import java.awt.Color;

public class Botao extends JButton{

	public Botao (String texto, Color cor) {
		setText(texto);
		setOpaque(true);
		setBackground(cor);
		setSize(50, 50);
	}
}
