package com.gymproject;

public class Exercicio {
	String nome;
	int id;
	
	public Exercicio(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getId() {
		return id;
	}
}