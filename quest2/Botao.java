package quest2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Botao implements ActionListener{

	private PainelMensagem painelMensagem;
	private String linguagem;
	
	public Botao() {
		
	}
	
	public Botao(PainelMensagem painelMensagem) {
		this.painelMensagem = painelMensagem;
	}
	
	public JButton criarBotao(String linguagem) {
		JButton botao = new JButton();
		this.linguagem = linguagem;
		botao.setText(linguagem);
		
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				painelMensagem.label.setText(linguagem);
				
			}
		});
		
		
		return botao;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
				
	}

}
