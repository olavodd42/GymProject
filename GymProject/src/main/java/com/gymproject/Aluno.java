package com.gymproject;

import java.util.Objects;

public class Aluno extends Pessoa {
	protected String FormaPag, defFisica, defMental, plano, objetivo;
	protected int dataCad, dataNasc, dataPag;
	protected boolean pago, estudante;
	protected String avaliacaoFisica;


	/*public Aluno(String nome, String email, int id, String telefone, int CPF, String FormaPag, boolean pago, String defFisica, String plano, boolean estudante) {
		super(nome, email, id, telefone, CPF);
		this.FormaPag = FormaPag;
		this.pago = pago;
		this.defFisica = defFisica;
		defMental = null;
		this.plano = plano;
		this.estudante = estudante;
	}
	
	public Aluno(String nome, String email, int id, String telefone, int CPF, String FormaPag, boolean pago, String defMental, String plano, boolean estudante) {
		super(nome, email, id, telefone, CPF);
		this.FormaPag = FormaPag;
		this.pago = pago;
		this.defMental = defMental;
		defFisica = null;
		this.plano = plano;
		this.estudante = estudante;
	}*/
	
	public Aluno(String nome, String email, int id, String telefone, int CPF, String FormaPag, boolean pago, String defFisica, String plano, boolean estudante, int dataCad, int dataNasc, int dataPag, String objetivo) {
		super(nome, email, id, telefone, CPF);
		this.FormaPag = FormaPag;
		this.pago = pago;
		this.defFisica = defFisica;
		this.plano = plano;
		this.estudante = estudante;
		this.dataCad = dataCad;
		this.dataNasc = dataNasc;
		this.dataPag = dataPag;
		this.objetivo = objetivo;
		this.avaliacaoFisica = null;
	}

	public Aluno(String nome, String email, int id, String telefone, int CPF, String FormaPag, boolean pago, String defFisica, String plano, boolean estudante, int dataCad, int dataNasc, int dataPag, String objetivo, String avaliacaoFisica) {
		super(nome, email, id, telefone, CPF);
		this.FormaPag = FormaPag;
		this.pago = pago;
		this.defFisica = defFisica;
		this.plano = plano;
		this.estudante = estudante;
		this.dataCad = dataCad;
		this.dataNasc = dataNasc;
		this.dataPag = dataPag;
		this.objetivo = objetivo;
		this.avaliacaoFisica = avaliacaoFisica;
	}
	
	public String getFormaPag() {
		return FormaPag;
	}
	
	public String getDefFisica() {
		return defFisica;
	}
	
	
	public String getPlano() {
		return plano;
	}
	
	public boolean ifPago() {
		return pago;
	}
	
	public boolean ifEstudante() {
		return estudante;
	}
	
	public int getDataCad() {
		return dataCad;
	}
	
	public int getDataNasc() {
		return dataNasc;
	}
	
	public int getDataPag() {
		return dataPag;
	}
	
	public String getObj() {
		return objetivo;
	}
	public String getAvaliacaoFisica() {
		return avaliacaoFisica;
	}
	
	public void alterarFormaPag(String FormaPag) {
		this.FormaPag = FormaPag;
	}
	
	public void setPago() {
		this.pago = true;
	}
	
	public void setNotPago() {
		this.pago = false;
	}
	
	public void setDefFisica(String defFisica) {
		this.defFisica = defFisica;
	}
	
	
	public void setPlano(String plano) {
		this.plano = plano;
	}
	
	public void setEstudante() {
		this.estudante = true;
	}
	
	public void setNotEstudante() {
		this.estudante = false;
	}
	
	public void dataPag(int dataPag) {
		this.dataPag = dataPag;
	}
	
	public void setObj(String objetivo) {
		this.objetivo = objetivo;
	}

	public void setAvaliacaoFisica(String avaliacaoFisica) {
		this.avaliacaoFisica = avaliacaoFisica;
	}
	
	public String toString() {
		String restricaoFisica = Objects.requireNonNullElse(getDefFisica(), "Não possui.");
		if (ifPago() && ifEstudante()) {
			return super.toString() + "\nFormaPag: " + getFormaPag() + "\nPagamento: em dia. Plano: " + getPlano()
			+ "\nEstudante: sim.\nData de Cadastro: " + getDataCad() + "\nData de Nascimento: " + getDataNasc() + "\nData de Pagamento: " + getDataPag() 
			+ "\nObjetivo principal: " + getObj() + "\nRestrição(s) Física(s): " + restricaoFisica;
		}
		else if (ifPago()) {
			return super.toString() + "\nFormaPag: " + getFormaPag() + "\nPagamento: em dia. Plano: " + getPlano()
			+ "\nEstudante: não.\nData de Cadastro: " + getDataCad() + "\nData de Nascimento: " + getDataNasc() + "\nData de Pagamento: " + getDataPag() 
			+ "\nObjetivo principal: " + getObj() + "\nRestrição(s) Física(s): " + restricaoFisica;
		}
		else if (ifEstudante()) {
			return super.toString() + "\nFormaPag: " + getFormaPag() + "\nPagamento: Vencido. Plano: " + getPlano()
			+ "\nEstudante: sim.\nData de Cadastro: " + getDataCad() + "\nData de Nascimento: " + getDataNasc() + "\nData de Pagamento: " + getDataPag() 
			+ "\nObjetivo principal: " + getObj() + "\nRestrição(s) Física(s): " + restricaoFisica;
		}	

		return super.toString() + "\nFormaPag: " + getFormaPag() + "\nPagamento: Vencido. Plano: " + getPlano()
		+ "\nEstudante: não.\nData de Cadastro: " + getDataCad() + "\nData de Nascimento: " + getDataNasc() + "\nData de Pagamento: " + getDataPag() 
		+ "\nObjetivo principal: " + getObj() + "\nRestrição(s) Física(s): " + restricaoFisica;
	}
}