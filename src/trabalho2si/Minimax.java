package trabalho2si;

import java.util.List;

public class Minimax {
	int[][] estado;
	Heuristica heuristica;
	int profundidade;
	
	
	Minimax(int[][] estado, int profundidade){
		this.estado = estado;
		this.profundidade = profundidade;
	}
	
	public int calcularMinimax() {
		return 0;
	}

	public void podaMinimax() {

	}

	public void criarNodoFilho() {

	}

	public boolean verificaVitoriaPecaJogada() {
		return false;
	}

	public Nodo minimax(Nodo nodo, int alpha, int beta) {
		if(nodo.isNodoFolha){
			return nodo;
		}
		
		return nodo;
	}
}

