package com.gymproject;

public class AcademiaBase{
	protected String nome, endereco, telefone, email;
	protected int id, CNPJ;
	
	public AcademiaBase(String nome, String email, String endereco, int id, String telefone, int CNPJ) {
		this.nome = nome;
		this.endereco = endereco;
		this.id = id;
		this.telefone = telefone;
		this.email = email;
		this.CNPJ = CNPJ;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEnd() {
		return endereco;
	}
	
	public int getId() {
		return id;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public int getCNPJ() {
		return CNPJ;
	}
	
	public void alterarNome(String nome) {
		this.nome = nome;
	}
	
	public void alterarEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void alterarTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void alterarEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "Nome: " + getNome() + "\nEndereço: " + getEnd() + "\nE-mail: " + getEmail() + "\nTelefone: " + getTelefone() + "\nCNPJ: " + getCNPJ();
	}
}