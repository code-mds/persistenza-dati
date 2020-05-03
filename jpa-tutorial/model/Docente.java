package model;

public class Docente extends Persona {
	private Corso corso;

	public Docente() {
		super();
	}

	public Docente(String nome, String cognome) {
		super(nome, cognome);
		this.corso = null;
	}

	public Corso getCorso() {
		return corso;
	}

	public void setCorso(Corso corso) {
		this.corso = corso;
	}
}