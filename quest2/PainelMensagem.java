package quest2;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelMensagem extends JPanel{

	public JLabel label;
	
	public PainelMensagem() {
		JLabel label = new JLabel();
		this.label = label;
		this.label.setText("Label");
		
		setLayout(new BorderLayout());
		add(this.label, BorderLayout.CENTER);
	}
	
	
}
