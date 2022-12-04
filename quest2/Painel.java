package quest2;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class Painel extends JPanel{

	PainelMensagem painelMensagem;
	
	public Painel(PainelMensagem painelMensagem) {
		this.painelMensagem = painelMensagem;
		add(criarBotoes());
	}
	
	public JPanel criarBotoes() {
		JPanel p = new JPanel();
		
		Botao botao = new Botao(painelMensagem);
		
		p.setLayout(new GridLayout(2,3));
		p.add(botao.criarBotao("Java"));
		p.add(botao.criarBotao("JavaScript"));
		p.add(botao.criarBotao("Python"));
		p.add(botao.criarBotao("C++"));
		p.add(botao.criarBotao("C#"));
		p.add(botao.criarBotao("C"));
		
		return p;
	}
	
}
