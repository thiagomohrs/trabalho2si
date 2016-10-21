package trabalho2si;

import java.util.ArrayList;

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
	
	public int[] calculaHeuristica(int[] posicoes, Nodo nodo){
		int peca;
		int[] listaSequenciasJogador = getSequencias(posicoes,nodo, 1);
		       	int pontComp = 0;
		        int pontJog = 0;
		        boolean jogador = false;
		        int pontuacao[];
				int[] temp = {0,0};
		        //a cada jogada precisa calcular
		        for (int i = 0; i < listaSequenciasJogador.; i++) {
					if(jogador){
						if (listaSequenciasJogador[i] == 4){
							pontJog += 10 * 4;}
						else{
							if (listaSequenciasJogador[1] == 3){
                        	pontJog += 10 * 3;
                        	}
						else{
							if (listaSequenciasJogador[1] == 2){
                        	pontJog += 10 * 2;
                        	}
						}
					}
				}
				if(!jogador){
					if (listaSequenciasJogador[1] == 4){
						pontComp += 10 * 4;
						}
						else{
						if (listaSequenciasJogador[1] == 3){
						pontComp += 10 * 3;
						}
                       	else{
                   		if (listaSequenciasJogador[1] == 2){
           				pontComp += 10 * 2;
                       	}
					}
				}
			}
		}
		int[] heuristica = {pontJog, pontComp};
		if (heuristica[0] != temp[0] || heuristica[1] != temp[1]) {
			int[] aux = heuristica;
		}
		return heuristica;
	}
	
	public int[] getSequencias(int[] ultimaPosicao, Nodo nodo, int jogador){
		int[] listaSequencias = null;
//		        listaSequencias.add(this.analisaColunaPecaTopo(nodo));
//		        listaSequencias.add(this.analisaLinhaPecaTopo(nodo));
//		        listaSequencias.add(this.analisaDiagDirPecaTopo(nodo));
//		        listaSequencias.add(this.analisaDiagEsqPecaTopo(ultimaPosicao,nodo, jogador));
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
