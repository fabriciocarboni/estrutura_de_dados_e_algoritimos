package com.carboni.estruturadados.vetor.teste;

import com.carboni.estruturadados.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {
		
		VetorObjetos vetor = new VetorObjetos(3);
		
		Contato c1 = new Contato("Contati1", "1234567", "c1@gmail.com");
		Contato c2 = new Contato("Contati2", "2345658", "c2@gmail.com");
		Contato c3 = new Contato("Contato3", "9999999", "c3@gmail.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println("Tamanho = " + vetor.tamanho());
		int pos = vetor.busca(c1);
		if (pos > -1){
			System.out.println("O elem existe no vetor.");
		} else {
			System.out.println("oelem nao existe no vetor.");
		}
		System.out.println(vetor);

	}

}
