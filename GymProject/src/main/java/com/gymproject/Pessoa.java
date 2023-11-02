package com.gymproject;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Pessoa {
	protected SimpleStringProperty nome, email, telefone, CPF;
	protected IntegerProperty id;
	
	public Pessoa(SimpleStringProperty nome, SimpleStringProperty email, IntegerProperty id, SimpleStringProperty telefone, SimpleStringProperty CPF) {
		this.nome = nome;
		this.email = email;
		this.id = id;
		this.telefone = telefone;
		this.CPF = CPF;
	}


	public int getId() {
		return id.get();
	}

	public IntegerProperty idProperty() {
		return id;
	}

	public void setId(int id) {
		this.id.set(id);
	}

	public String getCPF() {
		return CPF.get();
	}

	public SimpleStringProperty CPFProperty() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF.set(CPF);
	}

	public String getEmail() {
		return email.get();
	}

	public SimpleStringProperty emailProperty() {
		return email;
	}

	public void setEmail(String email) {
		this.email.set(email);
	}

	public String getTelefone() {
		return telefone.get();
	}

	public SimpleStringProperty telefoneProperty() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone.set(telefone);
	}

	public String getNome() {
		return nome.get();
	}

	public SimpleStringProperty nomeProperty() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome.set(nome);
	}

	public String toString() {
		return "ID: " + getId() + "\nNome: " + getNome() + "\nE-mail: " + getEmail() + "\nTelefone: " + getTelefone() + "\nCPF: " + getCPF();
	}
}