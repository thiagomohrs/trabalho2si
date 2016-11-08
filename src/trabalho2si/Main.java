package trabalho2si;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[][] matrizVazia = new int[6][7];
		iniciarMatriz(matrizVazia);
		Nodo nodoAtual = new Nodo(0, matrizVazia, Peca.EMPTY, 0, 0, false, 0, 0);
		nodoAtual.adicionarPeca(3, Peca.PLAYER_1);
		nodoAtual.imprimirNodo();
		Integer vencedor = null;
		Integer jogadorDaVez = null;
		jogadorDaVez = perguntarJogadorDaVez();
		int maiorSequencia = 0;
		do {
			if(jogadorDaVez == 1) {
				perguntarColunaDaJogada(nodoAtual); 
				jogadorDaVez = 2; // proximo jogador
			} else {
//				nodo.selecionarMelhorNodoFilho;
				jogadorDaVez = 2;//proximo jogador
			}
		} while(!nodoAtual.isNodoFolha);
	}

	private static Integer perguntarJogadorDaVez() {
		Scanner s = new Scanner(System.in);
	    System.out.println("Quem vai começar jogando (Jogador = 1 | IA = 2): ");
	    int jogador = s.nextInt();
		if (jogador == 1)
			return 1;
		else
			return 2;
		}
	
	private static void perguntarColunaDaJogada(Nodo nodo) {
		Scanner s = new Scanner(System.in);
	    System.out.println("Qual coluna você quer jogar? (1-7)");
	    int coluna = s.nextInt();
	    nodo.adicionarPeca(coluna+1, Peca.PLAYER_1);
		}
	

	private static void iniciarMatriz(int[][] matrizVazia) {
		for (int i = 0; i < matrizVazia.length; i++) {
			for (int j = 0; j < matrizVazia.length; j++) {
				matrizVazia[i][j] = Peca.EMPTY.getValue();
			}
		}
		
	}
}
