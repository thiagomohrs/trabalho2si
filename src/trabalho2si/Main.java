package trabalho2si;

public class Main {

	public static void main(String[] args) {
		int[][] matrizVazia = new int[6][7];
		iniciarMatriz(matrizVazia);
		Nodo nodoVazio = new Nodo(0, matrizVazia, Peca.EMPTY, 0, 0, false, 0, 0);
		nodoVazio.adicionarPeca(3, Peca.PLAYER_1);
		nodoVazio.imprimirNodo();
	}

	private static void iniciarMatriz(int[][] matrizVazia) {
		for (int i = 0; i < matrizVazia.length; i++) {
			for (int j = 0; j < matrizVazia.length; j++) {
				matrizVazia[i][j] = Peca.EMPTY.getValue();
			}
		}
		
	}
}
