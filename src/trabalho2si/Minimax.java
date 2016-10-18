package trabalho2si;

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

	public int analisaColunaPecaJogada(int[][] estado, int linhaJogada, int colunaJogada, int pecaJogada) {
		int quantidadePecasSequencia = 1;
//		tab, linha, coluna, pecaJogada):
//	        sequencia = 1
//
//	        # descendo coluna, verificações em linha reta
//	        for valorLinha in xrange(linha + 1, self._lenTab, 1):
//		for (int linha = 0; linha < this.estado.length; linha++) {
//			if (this.estado. == novaPeca.) {
//				quantidadePecasSequencia += 1;
//				if (quantidadePecasSequencia == 4) {
//					break;
//				} else{
//					quantidadePecasSequencia = 0;
//				}
//			}
//		}
		return quantidadePecasSequencia;
	}

	public int analisaLinhaPecaJogada() {
		int quantidadePecasSequencia = 1;
		return quantidadePecasSequencia;
	}

	public int analisaDiagonaisPecaJogada() {
		int quantidadePecasSequencia = 1;

		// Chama outros metodos pra analizar diagonais
		this.analisaDiagonalEsquerdaInferior();
		this.analisaDiagonalDireiraInferior();
		return quantidadePecasSequencia;
	}

	public int analisaDiagonalEsquerdaInferior() {
		int quantidadePecasSequencia = 0;
		return quantidadePecasSequencia;
	}

	public int analisaDiagonalDireiraInferior() {
		int quantidadePecasSequencia = 0;
		return quantidadePecasSequencia;
	}
}
