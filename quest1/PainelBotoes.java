package quest1;

import java.awt.Color;

import javax.swing.JPanel;

public class PainelBotoes extends JPanel {

	private JPanel painel;
	
	public PainelBotoes() {
		
	}
	
	public void addPainel(JPanel painel) {
		this.painel = painel;
		add(criarBotoes());
	}
	
	public JPanel criarBotoes() {
		JPanel p = new JPanel();
		
		Botao botao = new Botao(painel);
		
		p.add(botao.criarBotao("Amarelo",Color.YELLOW));
		p.add(botao.criarBotao("Verde",Color.GREEN));
		p.add(botao.criarBotao("Azul",Color.BLUE));
		
		
		return p;
	}
}
