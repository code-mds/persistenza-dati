package model;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

public class Corso {
	private String nome;
	private String descrizione;
	private List<Docente> docenti;
	private List<Studente> studenti;

	public Corso() {
	}

	public Corso(String nome, String descrizione) {
		this.nome = nome;
		this.descrizione = descrizione;
		this.docenti = new ArrayList<Docente>();
		this.studenti = new ArrayList<Studente>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public List<Docente> getDocenti() {
		return docenti;
	}

	public void addDocente(Docente docente) {
		docenti.add(docente);
		docente.setCorso(this);
	}

	public List<Studente> getStudenti() {
		return studenti;
	}

	public void addStudente(Studente studente) {
		studenti.add(studente);
		studente.getCorsi().add(this);
	}
}