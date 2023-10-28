package com.gymproject;

public class Pessoa {
	protected String nome, email, telefone;
	protected int id, CPF;
	
	public Pessoa(String nome, String email, int id, String telefone, int CPF) {
		this.nome = nome;
		this.email = email;
		this.id = id;
		this.telefone = telefone;
		this.CPF = CPF;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getId() {
		return id;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public int getCPF() {
		return CPF;
	}
	
	public void alterarEmail(String email) {
		this.email = email;
	}
	
	public void alterarTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String toString() {
		return "ID: " + getId() + "\nNome: " + getNome() + "\nE-mail: " + getEmail() + "\nTelefone: " + getTelefone() + "\nCPF: " + getCPF();
	}
}