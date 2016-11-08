package trabalho2si;

import java.util.List;

import br.ufsc.brocodeufsc.fourinaline.model.BoardState;
import br.ufsc.brocodeufsc.fourinaline.model.impl.AIBoardState;

public class Minimax {
//	int[][] estado;
//	Heuristica heuristica;
//	int profundidade;
	
	public static class MiniMaxParameters {

		private Integer alpha;

		private Integer beta;

		private MiniMaxParameters(final Integer alpha, final Integer beta) {
			this.alpha = alpha;
			this.beta = beta;
		}

		@Override
		public String toString() {
			return String.format("ALPHA[%d] BETA[%d]", alpha, beta);
		}

	}
	
//	Minimax(int[][] estado, int profundidade){
//		this.estado = estado;
//		this.profundidade = profundidade;
//	}
//	
//	public int calcularMinimax() {
//		return 0;
//	}
//
//	public void podaMinimax() {
//
//	}
//
//	public void criarNodoFilho() {
//
//	}
//
//	public boolean verificaVitoriaPecaJogada() {
//		return false;
//	}

	public Nodo minimax(Nodo nodo, int alpha, int beta) {
		if(nodo.isNodoFolha){
			return nodo;
		}
		final List<Nodo> children = nodo.createChildren();
		BoardState candidate = null;
		if(current instanceof AIBoardState) {
			for(final BoardState child : children) {
				candidate = minimax(child, parameters);
				final Integer score = candidate.getScore();
				if(score > parameters.alpha) {
					parameters.alpha = score;
				}
				if(parameters.alpha >= parameters.beta) {
					break;
				}
			}
		} else {
			for(final BoardState child : children) {
				candidate = minimax(child, parameters);
				final Integer score = candidate.getScore();
				if(score < parameters.beta) {
					parameters.beta = score;
				}
				if(parameters.alpha >= parameters.beta) {
					break;
				}
			}
		}
		return candidate;
	}
		return nodo;
	}
}

