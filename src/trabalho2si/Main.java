package trabalho2si;

public class Main {

	public static void main(String[] args) {
		int[][] matrizVazia = new int[6][8];
		Peca peca = new Peca();
		Nodo nodoVazio = new Nodo(0, matrizVazia, peca, 0, 0, false, 0, 0);
		nodoVazio.imprimirNodo();
	}
}
