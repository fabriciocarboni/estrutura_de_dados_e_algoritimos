package com.carboni.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {

	private T[] elementos;
	private int tamanho;

	public Lista(int capacidade){
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	public Lista(int capacidade, Class<T> tipoClasse){
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}

	public boolean adiciona(T elemento) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}

		return false;
	}	


	//adiciona um elemento em qq posicao do vetor
	public boolean adiciona(int posicao, T elemento){

		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao invalida");
		}

		this.aumentaCapacidade();

		//mover todos os elementos para proxima casa e deixar a posicao 0 livre
		for (int i=this.tamanho; i>=posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;// adicionar 1 ao tamanho
		return true;
	}

	private void aumentaCapacidade(){
		if (this.tamanho == this.elementos.length){
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i=0; i<this.elementos.length; i++){
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}


	public Object busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		return this.elementos[posicao];
	}

	public int busca(T elemento) {
		//busca sequencial é o mais simples
		for (int i=0; i<this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)){
				return i;
			}
		}
		return -1; //retorna -1 quando a posicao nao existe
	}


	public void remove(int posicao){
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posicao invalida");
		}
		for (int i=posicao; i<this.tamanho-1;i++){
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}


	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i=0; i<this.tamanho-1; i++){
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		s.append("]");

		return s.toString();
	}

}


