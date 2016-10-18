package trabalho2si;

public class Heuristica {

	public int calculaHeuristicaEstado(Nodo nodo){
		int pontuacao = 0;
		if (nodo.isNodoFolha){
            if (nodo.novaPeca == Peca.PLAYER_2){
                pontuacao = 10 * 4 - nodo.profundidade * 25;
            }else {
                	if (nodo.novaPeca == Peca.PLAYER_1){
                pontuacao = -10 * 4 - nodo.profundidade * 25;
               }
            }
		} else {
		}
		return pontuacao;
	}
	
	public int calculaHeuristica(Nodo nodo){
		
		return 0;
	}
	
	public int[] getSequencias(Nodo nodo){
		int [] listaSequencias;
		        listaSequencias.add(this.analisaColunaPecaTopo(nodo));
		        listaSequencias.add(this.analisaLinhaPecaTopo(nodo));
		        listaSequencias.add(this.analisaDiagDirPecaTopo(nodo));
		        listaSequencias.add(this.analisaDiagEsqPecaTopo(nodo));

		        return listaSequencias;
	}

	private int analisaDiagEsqPecaTopo(Nodo nodo) {
		// TODO Auto-generated method stub
		return 0;
	}

	private int analisaDiagDirPecaTopo(Nodo nodo) {
		// TODO Auto-generated method stub
		return 0;
	}

	private int analisaLinhaPecaTopo(Nodo nodo) {
		// TODO Auto-generated method stub
		return 0;
	}

	private int analisaColunaPecaTopo(Nodo nodo) {
		// TODO Auto-generated method stub
		return 0;
	}
}
