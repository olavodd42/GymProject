package com.gymproject;

import javafx.beans.property.*;

import java.time.LocalDate;
import java.util.Objects;

public class Aluno extends Pessoa {
	protected SimpleStringProperty FormaPag, defFisica, defMental, plano, objetivo = new SimpleStringProperty();
	protected ObjectProperty<LocalDate> dataCad, dataNasc, dataPag;
	protected SimpleBooleanProperty pago, estudante;
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

	public Aluno(SimpleStringProperty nome, SimpleStringProperty email, IntegerProperty id, SimpleStringProperty telefone, SimpleStringProperty CPF,
				 SimpleStringProperty FormaPag, SimpleBooleanProperty pago, SimpleStringProperty defFisica, SimpleStringProperty plano, SimpleBooleanProperty estudante,
				 ObjectProperty<LocalDate> dataCad, ObjectProperty<LocalDate> dataNasc, ObjectProperty<LocalDate> dataPag, SimpleStringProperty objetivo) {
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

	public Aluno(SimpleStringProperty nome, SimpleStringProperty email, IntegerProperty id, SimpleStringProperty telefone,
				 SimpleStringProperty CPF, SimpleStringProperty FormaPag, SimpleBooleanProperty pago, SimpleStringProperty defFisica,
				 SimpleStringProperty plano, SimpleBooleanProperty estudante, ObjectProperty<LocalDate> dataCad,
				 ObjectProperty<LocalDate> dataNasc, ObjectProperty<LocalDate> dataPag, SimpleStringProperty objetivo,
				 String avaliacaoFisica) {
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

	public String getAvaliacaoFisica() {
		return avaliacaoFisica;
	}

	public void setAvaliacaoFisica(String avaliacaoFisica) {
		this.avaliacaoFisica = avaliacaoFisica;
	}

	public boolean isEstudante() {
		return estudante.get();
	}

	public SimpleBooleanProperty estudanteProperty() {
		return estudante;
	}

	public void setEstudante(boolean estudante) {
		this.estudante.set(estudante);
	}

	public boolean isPago() {
		return pago.get();
	}

	public SimpleBooleanProperty pagoProperty() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago.set(pago);
	}

	public LocalDate getDataPag() {
		return dataPag.get();
	}

	public ObjectProperty<LocalDate> dataPagProperty() {
		return dataPag;
	}

	public void setDataPag(LocalDate dataPag) {
		this.dataPag.set(dataPag);
	}

	public LocalDate getDataNasc() {
		return dataNasc.get();
	}

	public ObjectProperty<LocalDate> dataNascProperty() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc.set(dataNasc);
	}

	public LocalDate getDataCad() {
		return dataCad.get();
	}

	public ObjectProperty<LocalDate> dataCadProperty() {
		return dataCad;
	}

	public void setDataCad(LocalDate dataCad) {
		this.dataCad.set(dataCad);
	}

	public String getObjetivo() {
		return objetivo.get();
	}

	public SimpleStringProperty objetivoProperty() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo.set(objetivo);
	}

	public String getPlano() {
		return plano.get();
	}

	public SimpleStringProperty planoProperty() {
		return plano;
	}

	public void setPlano(String plano) {
		this.plano.set(plano);
	}

	public String getDefFisica() {
		return defFisica.get();
	}

	public SimpleStringProperty defFisicaProperty() {
		return defFisica;
	}

	public void setDefFisica(String defFisica) {
		this.defFisica.set(defFisica);
	}

	public String getDefMental() {
		return defMental.get();
	}

	public SimpleStringProperty defMentalProperty() {
		return defMental;
	}

	public void setDefMental(String defMental) {
		this.defMental.set(defMental);
	}

	public String getFormaPag() {
		return FormaPag.get();
	}

	public SimpleStringProperty formaPagProperty() {
		return FormaPag;
	}

	public void setFormaPag(String formaPag) {
		this.FormaPag.set(formaPag);
	}
}