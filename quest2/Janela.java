package quest2;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Janela extends JFrame {
	
	private JPanel painel;
	
	public Janela(JPanel painel) {
		setSize(400,400);
		this.painel = painel;
		add(this.painel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
