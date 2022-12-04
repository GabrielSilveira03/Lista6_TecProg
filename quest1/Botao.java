package quest1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Botao implements ActionListener {

	private JPanel painel;
	private String textoCor;
	private Color cor;
	
	public Botao(JPanel painel) {
		this.painel = painel;
	}
	
	public JButton criarBotao(String nomeCor,Color cor) {
		JButton botao = new JButton();
		this.textoCor = nomeCor;
		this.cor = cor;
		botao.setText(textoCor);
		
		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painel.setBackground(cor);
			}
		});
		
		return botao;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Stub de método gerado automaticamente
		
	}
	
	

	
}
