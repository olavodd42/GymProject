package com.gymproject;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Instrutor extends Funcionario {
	protected String inscricaoCREF, filiacao, naturalidade, nacionalidade;
	protected int expedicao, validade, nascimento;
	public Instrutor(SimpleStringProperty nome, SimpleStringProperty email, IntegerProperty id, SimpleStringProperty telefone,
					 SimpleStringProperty CPF, int RG, float salario, String inscricaoCREF, int expedicao, int validade,
					 String filiacao, String naturalidade, String nacionalidade, int nascimento) {
		super(nome, email, id, telefone, CPF, RG, salario);
		this.inscricaoCREF = inscricaoCREF;
		this.expedicao = expedicao;
		this.validade = validade;
		this.filiacao = filiacao;
		this.naturalidade = naturalidade;
		this.nacionalidade = nacionalidade;
		this.nascimento = nascimento;
	}
	
	public String getInscricaoCREF() {
		return inscricaoCREF;
	}
	
	public int expedicao() {
		return expedicao;
	}
	
	public int getValidade() {
		return validade;
	}
	
	public String getNaturalidade() {
		return naturalidade;
	}
	
	public String getNacionalidade() {
		return nacionalidade;
	}
	
	public int getNascimento() {
		return nascimento;
	}
	
	public String toString() {
		return super.toString() + "\nInscrição CREF: " + getInscricaoCREF() + "\nData de validade CREF: " + getValidade() + "\nNaturalidade: " + getNaturalidade() 
		+ "\nNacionalidade: " + getNacionalidade() + "\nData de nascimento: " + getNascimento();
	}
}