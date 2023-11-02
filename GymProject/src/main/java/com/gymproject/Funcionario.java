package com.gymproject;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

public class Funcionario extends Pessoa {
	protected int RG;
	protected float salario;
	
	public Funcionario(SimpleStringProperty nome, SimpleStringProperty email, IntegerProperty id, SimpleStringProperty telefone, SimpleStringProperty CPF, int RG, float salario) {
		super(nome, email, id, telefone, CPF);
		this.RG = RG;
		this.salario = salario;
	}
	
	public int getRG() {
		return RG;
	}
	
	public float getSalario() {
		return salario;
	}
	
	public void alterarSalario(float valor) {
		salario += valor;
	}
	
	public String toString() {
		return super.toString() + "RG: " + getRG() + "\nSalario: " + getSalario();
	}
}