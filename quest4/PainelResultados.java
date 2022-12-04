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

public class PainelResultados extends JPanel {

	private PainelInserir painelInserir;
	private int maiorValor;
	private int menorValor;
	private double media;
	private ArrayList<Integer> listaNumeros = new ArrayList<>();
	private JTextField texto1;
	private JTextField texto2;
	private JTextField texto3;
	
	
	public PainelResultados(PainelInserir painelInserir) {
		texto1 = criarCampoTexto();
		texto2 = criarCampoTexto();
		texto3 = criarCampoTexto();
		this.painelInserir = painelInserir;
		JButton botao = criarBotaoExibir();
		setPreferredSize(new Dimension(150,350));
		setLayout(new GridLayout(3,3));
		add(new JLabel("Maior >>>"));
		add(texto1);
		add(new JLabel(""));
		add(new JLabel("Menor >>>"));
		add(texto2);
		add(botao);
		add(new JLabel("Media >>>"));
		add(texto3);
		add(new JLabel(""));
	}
	
	public JTextField criarCampoTexto() {
		JTextField texto = new JTextField();
		
		return texto;
	}
	
	public JButton criarBotaoExibir() {
		JButton botao = new JButton();
		botao.setText("Exibir");
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				listaNumeros = painelInserir.getListaNumeros();
				calcularMaior();
				calcularMenor();
				calcularMedia();
				texto1.setText("" + maiorValor);
				texto2.setText("" + menorValor);
				texto3.setText("" + media);
			}
		});
		
		return botao;
	}
	
	public void calcularMaior() {
		maiorValor = -99999999;
		for (Integer inteiro : listaNumeros) {
			if(inteiro>maiorValor) {
				maiorValor=inteiro;
			}
		}
	}
	
	public void calcularMenor() {
		menorValor = 99999999;
		for (Integer inteiro : listaNumeros) {
			if(inteiro<menorValor) {
				menorValor=inteiro;
			}
		}
	}
	
	public void calcularMedia() {
		int somatorio = somatorio();
		int quant = listaNumeros.size();
		media = (somatorio / quant);
	}
	
	public int somatorio() {
		int somatorio=0;
		for (Integer inteiro : listaNumeros) {
			somatorio += inteiro;
		}
		
		return somatorio;
	}
}
