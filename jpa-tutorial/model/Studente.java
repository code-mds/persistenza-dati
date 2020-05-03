package model;

import java.util.ArrayList;
import java.util.List;

public class Studente extends Persona {
	private List<Corso> corsi;

	public Studente() {
		super();
	}

	public Studente(String nome, String cognome) {
		super(nome, cognome);
		this.corsi = new ArrayList<Corso>();
	}

	public List<Corso> getCorsi() {
		return corsi;
	}

	public void addCorso(Corso corso) {
		corsi.add(corso);
		corso.getStudenti().add(this);
	}
}