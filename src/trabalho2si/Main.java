package trabalho2si;

public class Main {

	public static void main(String[] args) {
		int[][] matrizVazia = new int[6][7];
		iniciarMatriz(matrizVazia);
		Nodo nodoVazio = new Nodo(0, matrizVazia, Peca.EMPTY, 0, 0, false, 0, 0);
		nodoVazio.adicionarPeca(3, Peca.PLAYER_1);
		nodoVazio.imprimirNodo();
		Integer vencedor = null;
		Integer jogadorDaVez = null;
		jogadorDaVez = perguntarJogadorDaVez();
		int maiorSequencia = 0;
		while(vencedor == null){
			//Jogada
			nodoVazio.adicionarPeca(3, Peca.PLAYER_1);
			if(maiorSequencia == 4){
				vencedor = jogadorDaVez;
			}
		}
	}

	private static Integer perguntarJogadorDaVez() {
		if(jogador){
			return 1;
		}
		return 2;
	}

	private static void iniciarMatriz(int[][] matrizVazia) {
		for (int i = 0; i < matrizVazia.length; i++) {
			for (int j = 0; j < matrizVazia.length; j++) {
				matrizVazia[i][j] = Peca.EMPTY.getValue();
			}
		}
		
	}
}
