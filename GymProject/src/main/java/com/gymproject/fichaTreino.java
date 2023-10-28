package com.gymproject;

import java.util.ArrayList;

public class fichaTreino {
	protected ArrayList<Exercicio> listaExercicios;
	protected ArrayList<Integer> numSeries;
	protected ArrayList<Integer> numRepeticoes;
	
	public fichaTreino() {
		listaExercicios = new ArrayList<Exercicio>();
		numSeries = new ArrayList<Integer>();
		numRepeticoes = new ArrayList<Integer>();
	}
	
	public void addExercicio(Exercicio ex, int num1, int num2) {
		listaExercicios.add(ex);
		numSeries.add(num1);
		numRepeticoes.add(num2);
	}
	
	public int searchExercicio(Exercicio ex) {
		return listaExercicios.indexOf(ex);
	}
	
	public void removeAll() {
		listaExercicios.clear(); 
	}
}