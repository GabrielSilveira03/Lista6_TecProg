package quest2;

public class Main {

	public static void main(String[] args) {
		
		PainelMensagem painelLabel = new PainelMensagem();
		Painel painelBotoes = new Painel(painelLabel);
		PainelGeral painelGeral = new PainelGeral(painelBotoes, painelLabel); 
		Janela janela = new Janela(painelGeral);
	}

}
