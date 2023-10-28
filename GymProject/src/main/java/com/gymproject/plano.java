package com.gymproject;

public class plano {
	protected String nome;
	protected float valor;
	
	public plano(String nome, float valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float aumento) {
		valor += aumento;
	}
}