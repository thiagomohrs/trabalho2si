package trabalho2si;

public class Main {

	public static void main(String[] args) {
		int[][] matrizVazia = new int[6][7];
		Nodo nodoVazio = new Nodo(0, matrizVazia, Peca.EMPTY, 0, 0, false, 0, 0);
		nodoVazio.imprimirNodo();
	}
}
