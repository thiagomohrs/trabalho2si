package trabalho2si;

import java.util.ArrayList;
import java.util.List;

import br.ufsc.brocodeufsc.fourinaline.model.Board;
import br.ufsc.brocodeufsc.fourinaline.model.BoardState;

public class Nodo {

	int id;
	int[][] estado;
	Peca novaPeca;
	int heutristica;
	int profundidade;
	boolean isNodoFolha;
	int alpha;
	int beta;

	public Nodo(int id, int[][] estado, Peca novaPeca, int heutristica, int profundidade, boolean isNodoFolha, int alpha, int beta) {
		super();
		this.id = id;
		this.estado = estado;
		this.novaPeca = novaPeca;
		this.heutristica = heutristica;
		this.profundidade = profundidade;
		this.isNodoFolha = isNodoFolha;
		this.alpha = alpha;
		this.beta = beta;
	}
	
	public void imprimirNodo() {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(this.estado[i][j]);
			}
			System.out.println("");
		}
	}
	
	public void adicionarPeca(Integer coluna, Peca peca) {
        for (int linha = this.estado.length -1 ; linha >= 0; linha--) {
        	if (this.estado[linha][coluna] == Peca.EMPTY.getValue()) {
        		this.estado[linha][coluna] = peca.getValue();
        		break;
			}
        }
	}

	public List<Nodo> criarFilhos(Nodo nodo) {
		final Integer[] colunas = { 3, 4, 2, 5, 1, 6, 0 };
		final List<Nodo> filhos = new ArrayList<>();
		for(final Integer coluna : colunas) {
//			Nodo filho = this.adicionarPeca(coluna, Peca.PLAYER_2);
			filhos.add(nodo);
		}
		return filhos;
	}
}
