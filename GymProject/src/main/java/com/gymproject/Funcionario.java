package com.gymproject;

public class Funcionario extends Pessoa {
	protected int RG;
	protected float salario;
	
	public Funcionario(String nome, String email, int id, String telefone, int CPF, int RG, float salario) {
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