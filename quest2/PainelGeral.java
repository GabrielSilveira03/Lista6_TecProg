package quest2;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class PainelGeral extends JPanel {
	
	private JPanel painelBotoes;
	private JPanel painelMensagem;
	
	public PainelGeral(JPanel painelBotoes,JPanel painelMensagem) {
		this.painelBotoes = painelBotoes;
		this.painelMensagem = painelMensagem;
		
		setLayout(new BorderLayout());
		add(this.painelBotoes, BorderLayout.CENTER);
		add(this.painelMensagem, BorderLayout.NORTH);
	}
}
