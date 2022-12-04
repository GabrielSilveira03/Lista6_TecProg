package quest4;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelInserir extends JPanel {

	private ArrayList<Integer> listaNumeros = new ArrayList<>();
	private JTextField texto;
	
	public PainelInserir() {
		texto = criarCampoTexto();
		JLabel label = new JLabel();
		setPreferredSize(new Dimension(150,350));
		setLayout(new GridLayout(2,2));
		add(new JLabel("Digite um numero:"));
		add(new JLabel(""));
		add(texto);
		add(addBotaoOK(texto));
	}
	
	public ArrayList getListaNumeros() {
		return listaNumeros;
	}
	
	public JTextField criarCampoTexto() {
		JTextField texto = new JTextField();
		texto.setPreferredSize(new Dimension(150,50));
		
		return texto;
	}
	
	public JButton addBotaoOK(JTextField texto) {
		JButton botao = new JButton();
		botao.setText("OK");
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(texto.getText());
				listaNumeros.add(num);
				texto.setText("");
			}
		});
		
		return botao;
	}
}
