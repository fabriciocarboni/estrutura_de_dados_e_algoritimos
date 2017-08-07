package com.carboni.estruturadados.vetor;

import com.carboni.estruturadados.base.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T>{

	public Lista2(){
		super(); //chama o construtor default
	}
	
	public Lista2(int capacidade ){
		super(capacidade);
	}
	
	public boolean adiciona(T elemento){
		return super.adiciona(elemento);
	}
	
	public boolean adiciona(int posicao, T elemento){
		return super.adiciona(posicao, elemento);
	}
	
}
