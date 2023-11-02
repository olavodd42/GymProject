package com.gymproject;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Gerente extends Funcionario {
	public Gerente(SimpleStringProperty nome, SimpleStringProperty email, IntegerProperty id, SimpleStringProperty telefone,
				   SimpleStringProperty CPF, int RG, float salario) {
		super(nome, email, id, telefone, CPF, RG, salario);
	}
	
	public String toString() {
		return super.toString();
	}
}