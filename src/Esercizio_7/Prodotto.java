package Esercizio_7;

public class Prodotto {
	
	private String codice;
	private String descrizione;
	private double prezzo;
	
	public Prodotto(String codice, String descrizione, double prezzo) {
		this.codice = codice;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}

	protected String getCodice() {
		return codice;
	}

	protected void setCodice(String codice) {
		this.codice = codice;
	}

	protected String getDescrizione() {
		return descrizione;
	}

	protected void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	protected double getPrezzo() {
		return prezzo;
	}

	protected void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public String toString() {
		return "Codice: " + codice + "\nDescrzione: " + descrizione + "\nPrezzo: " + prezzo;
	}
	
	
	public double applicaSconto() {
		return (prezzo * 95)/100;
	}
	
}
