package Esercizio_7;

public class NonAlimentari extends Prodotto {

	private String materiale;
	
	public NonAlimentari(String codice, String descrizione, double prezzo, String materiale) {
		super(codice, descrizione, prezzo);
		this.materiale = materiale;
	}

	protected String getMateriale() {
		return materiale;
	}

	protected void setMateriale(String materiale) {
		this.materiale = materiale;
	}

	@Override
	public String toString() {
		return "Codice: " + getCodice() + "\nDescrzione: " + getDescrizione() + "\nPrezzo: " + getPrezzo() + "\nMateriale: " + materiale;
	}

	@Override
	public double applicaSconto() {
		String materiali_consentiti = "plastica vetro carta alluminio";
		if(materiali_consentiti.contains(materiale)){
			return (getPrezzo() * 90) / 100;
		}else {
			return super.applicaSconto();
		}
		
	}

}
