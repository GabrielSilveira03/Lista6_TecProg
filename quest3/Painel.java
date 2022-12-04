package quest3;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Painel extends JPanel {

	private JButton botao;
	private JTextField texto;
	
	public Painel() {
		this.texto = criarCampoTexto();
		this.botao = criarBotao(texto);
		
		setPreferredSize(new Dimension(400,200));
		setLayout(new FlowLayout());
		add(texto);
		add(botao);
	}
	
	public JButton criarBotao(JTextField texto) {
		JButton botao = new JButton();
		botao.setPreferredSize(new Dimension(100,50));
		botao.setText("ENVIAR");
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Janela janelaOption = new Janela();

				JOptionPane.showConfirmDialog(janelaOption
						, texto.getText()
						,"Message"
						, JOptionPane.CLOSED_OPTION
						, JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		return botao;
	}
	
	public JTextField criarCampoTexto() {
		JTextField texto = new JTextField();
		texto.setPreferredSize(new Dimension(150,50));
		
		return texto;
	}
}
