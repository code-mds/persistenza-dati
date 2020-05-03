package model;

public class NumeroTelefono {
	private String prefissoInternazionale;
	private String prefisso;
	private String numero;
	private Persona persona;

	public NumeroTelefono() {
	}

	public NumeroTelefono(String prefissoInternazionale, String prefisso,
			String numero) {
		this.prefissoInternazionale = prefissoInternazionale;
		this.prefisso = prefisso;
		this.numero = numero;
		this.persona = null;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPrefisso() {
		return prefisso;
	}

	public void setPrefisso(String prefisso) {
		this.prefisso = prefisso;
	}

	public String getPrefissoInternazionale() {
		return prefissoInternazionale;
	}

	public void setPrefissoInternazionale(String prefissoInternazionale) {
		this.prefissoInternazionale = prefissoInternazionale;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
}