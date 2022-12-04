package quest1;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class Painel extends JPanel {
	
	public JPanel painelbotoes;
	
	public Painel(JPanel painelbotoes) {
		this.painelbotoes = painelbotoes;
		
		setLayout(new BorderLayout());
		add(painelbotoes, BorderLayout.NORTH);
	}
}
