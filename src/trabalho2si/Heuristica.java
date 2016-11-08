package trabalho2si;

public class Heuristica {

	private int[] listaSequencias = null;

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

	public int[] calculaHeuristica(int[] posicoes, Nodo nodo, int jogador){
		int[] listaSequenciasJogador = getSequencias(posicoes,nodo, 1);
		int pontComp = 0;
		int pontJog = 0;
		for (int i = 0; i < listaSequencias.length; i++) {
			if(jogador == 1){
				if (listaSequenciasJogador[i] == 4){
					pontJog += 10 * 4;}
				else{
					if (listaSequenciasJogador[i] == 3){
						pontJog += 10 * 3;
					}
					else{
						if (listaSequenciasJogador[i] == 2){
							pontJog += 10 * 2;
						} else{
							pontJog += 10;
						}
					}
				}
			}
			if(jogador == 2){
				if (listaSequenciasJogador[i] == 4){
					pontComp += 10 * 4;
				}
				else{
					if (listaSequenciasJogador[i] == 3){
						pontComp += 10 * 3;
					}
					else{
						if (listaSequenciasJogador[i] == 2){
							pontComp += 10 * 2;
						}
						else{
							pontComp += 10;
						}
					}
				}
			}
		}
		int[] heuristica = {pontJog, pontComp};
		return heuristica;
	}

	public int[] getSequencias(int[] ultimaPosicao, Nodo nodo, int jogador){
		listaSequencias[0]= this.analisaColunaPecaTopo(ultimaPosicao, nodo, jogador);
		listaSequencias[1]= this.analisaLinhaPecaTopo(ultimaPosicao, nodo, jogador);
		listaSequencias[2]= this.analisaDiagDirPecaTopo(ultimaPosicao, nodo, jogador);
		listaSequencias[3]= this.analisaDiagEsqPecaTopo(ultimaPosicao,nodo, jogador);
		return listaSequencias;
	}

	private int analisaDiagEsqPecaTopo(int[] ultimaPosicao, Nodo nodo, int jogador) {
		int quantidadeSequencia = 1;
		for (int linha = ultimaPosicao[0]; linha <= 0; linha--) {
			for (int coluna = ultimaPosicao[1]; coluna <= 0; coluna--) {
				if(linha >= 0 && linha<= 6 && coluna >= 0 && coluna <= 7){
					if(nodo.estado[linha][coluna] == jogador){
						quantidadeSequencia++;
					} else{
						return quantidadeSequencia;
					}
				}
			}
		}
		return quantidadeSequencia;
	}

	private int analisaDiagDirPecaTopo(int[] ultimaPosicao, Nodo nodo, int jogador) {
		int quantidadeSequencia = 1;
		for (int linha = ultimaPosicao[0]; linha <= 0; linha--) {
			for (int coluna = ultimaPosicao[1]; coluna <= 7; coluna++) {
				if(linha >= 0 && linha<= 6 && coluna >= 0 && coluna <= 7){
					if(nodo.estado[linha][coluna] == jogador){
						quantidadeSequencia++;
					} else{
						return quantidadeSequencia;
					}
				}
			}
		}
		return quantidadeSequencia;
	}

	private int analisaLinhaPecaTopo(int[] ultimaPosicao, Nodo nodo, int jogador) {
		int quantidadeSequencia = 1;
		for (int colunaEsq = ultimaPosicao[1]; colunaEsq <= 0; colunaEsq--) {
			if(colunaEsq >= 0 && colunaEsq<= 7){
				if(nodo.estado[colunaEsq][ultimaPosicao[1]] == jogador){
					quantidadeSequencia++;
				} else{
					for (int colunaDir = ultimaPosicao[1]; colunaDir <= 7; colunaDir++) {
						if(colunaDir >= 0 && colunaDir<= 7){
							if(nodo.estado[colunaDir][ultimaPosicao[1]] == jogador){
								quantidadeSequencia++;
							} 
						} else{
							return quantidadeSequencia;
						}
					}
				}
			}
		}
		return quantidadeSequencia;
	}

	private int analisaColunaPecaTopo(int[] ultimaPosicao, Nodo nodo, int jogador) {
		int quantidadeSequencia = 1;
		for (int linha = ultimaPosicao[0]; linha <= 0; linha--) {
			if(linha >= 0 && linha<= 6){
				if(nodo.estado[linha][ultimaPosicao[1]] == jogador){
					quantidadeSequencia++;
				} else{
					return quantidadeSequencia;
				}
			}
		}
		return quantidadeSequencia;
	}
}
