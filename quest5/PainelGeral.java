package quest5;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelGeral extends JPanel {

	private JTextField texto;
	private JLabel label;
	private JComboBox comboBox;
	private JButton botao;
	
	
	public PainelGeral() {
		setPreferredSize(new Dimension(400,200));
		setLayout(new GridLayout(3,3));
		texto = new JTextField();
		label = new JLabel("");
		comboBox = criarComboBox();
		botao = criarBotao();
		add(new JLabel("Valores:"));
		add(texto);
		add(new JLabel(""));
		add(new JLabel(""));
		add(comboBox);
		add(botao);
		add(new JLabel("Resultado:"));
		add(label);
		add(new JLabel(""));
	}
	
	public JComboBox criarComboBox() {
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Somar");
		comboBox.addItem("Multiplicar");
		
		return comboBox;
	}
	
	public JButton criarBotao() {
		JButton botao = new JButton();
		botao.setText("Calcular");
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem() == "Somar") {
					label.setText(""+somarCombo(Integer.parseInt(texto.getText())));
				} else if(comboBox.getSelectedItem() == "Multiplicar") {
					label.setText(""+multiplicarCombo(Integer.parseInt(texto.getText())));
				}
			}
		});
		return botao;
	}
	
	public int somarCombo(int num) {
		int num1 = num/10;
		int num2 = num%10;
		int soma = num1 + num2;
		
		return soma;
	}
	
	public int multiplicarCombo(int num) {
		int num1 = num/10;
		int num2 = num%10;
		int produto = num1 * num2;
		
		return produto;
	}
}
