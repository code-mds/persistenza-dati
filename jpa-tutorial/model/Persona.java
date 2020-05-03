package model;

import java.util.ArrayList;
import java.util.List;

public class Persona {
	private String nome;
	private String cognome;
	private Indirizzo indirizzo;
	private List<NumeroTelefono> numeriTelefono;

	public Persona() {
	}

	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = null;
		this.numeriTelefono = new ArrayList<NumeroTelefono>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Indirizzo getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(Indirizzo indirizzo) {
		this.indirizzo = indirizzo;
	}

	public List<NumeroTelefono> getNumeriTelefono() {
		return numeriTelefono;
	}

	public void addNumeroTelefono(NumeroTelefono numeroTelefono) {
		numeriTelefono.add(numeroTelefono);
		numeroTelefono.setPersona(this);
	}
}