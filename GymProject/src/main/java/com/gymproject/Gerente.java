package com.gymproject;

public class Gerente extends Funcionario {
	public Gerente(String nome, String email, int id, String telefone, int CPF, int RG, float salario) {
		super(nome, email, id, telefone, CPF, RG, salario);
	}
	
	public String toString() {
		return super.toString();
	}
}