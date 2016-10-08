package trabalho2si;

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
}
