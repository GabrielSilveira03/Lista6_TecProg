package quest4;

public class Main {

	public static void main(String[] args) {
		PainelInserir painelInserir = new PainelInserir();
		PainelResultados painelResultados = new PainelResultados(painelInserir);
		PainelGeral painelGeral = new PainelGeral(painelInserir, painelResultados);
		Janela janela = new Janela(painelGeral);
	}

}
