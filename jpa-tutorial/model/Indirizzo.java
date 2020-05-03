package model;

public class Indirizzo {
	private int cap;
	private String citta;
	private String via;

	public Indirizzo() {
	}

	public Indirizzo(int cap, String citta, String via) {
		this.cap = cap;
		this.citta = citta;
		this.via = via;
	}

	public int getCap() {
		return cap;
	}

	public String getCitta() {
		return citta;
	}

	public String getVia() {
		return via;
	}

	public void setCap(int cap) {
		this.cap = cap;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public void setVia(String via) {
		this.via = via;
	}
}