package quest4;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class PainelGeral extends JPanel {

	private PainelInserir painelInserir;
	private PainelResultados painelResultados;
	
	public PainelGeral(PainelInserir painelInserir,PainelResultados painelResultados) {
		this.painelInserir = painelInserir;
		this.painelResultados = painelResultados;
		setPreferredSize(new Dimension(400,400));
		setLayout(new GridLayout(2,1));
		add(painelInserir);
		add(painelResultados);
	}
}
