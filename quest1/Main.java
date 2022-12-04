package quest1;

public class Main {

	public static void main(String[] args) {
		
		PainelBotoes painelbotoes = new PainelBotoes();
		Painel painel = new Painel(painelbotoes);
		painelbotoes.addPainel(painel);
		Janela j = new Janela(painel);

	}

}
