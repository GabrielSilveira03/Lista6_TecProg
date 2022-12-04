package quest4;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Janela extends JFrame{

	private JPanel painel;
	
	public Janela(JPanel painel) {
		setSize(400,400);
		this.painel = painel;
		add(this.painel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
