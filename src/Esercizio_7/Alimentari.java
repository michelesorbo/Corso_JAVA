package Esercizio_7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class Alimentari extends Prodotto {
	
	private LocalDate scadenza;
	protected DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ITALY);

	public Alimentari(String codice, String descrizione, double prezzo, String d_scadenza) throws ParseException {
		super(codice, descrizione, prezzo);
		this.scadenza = setScadenza(d_scadenza); //Per far inserire la data in formato Italiano
	}

	protected String getScadenza() {
		return scadenza.format(formatter);
	}

	/*Metodo Difficile
	protected LocalDate setScadenza(String d_scadenza) {
		//Il formato inserito sarà giorno/mese/anno
		String[] data = d_scadenza.split("/");
		int anno = Integer.parseInt(data[2]); 
		int mese = Integer.parseInt(data[1]);
		int giorno = Integer.parseInt(data[0]);
		scadenza = LocalDate.of(anno, mese, giorno);
		return scadenza;
	}
	FINE METODO DIFFICILE */
	
	protected LocalDate setScadenza(String d_scadenza) throws ParseException {
		return scadenza = LocalDate.parse(d_scadenza, formatter);
	}
	
	@Override
	public String toString() {
		return "Codice: " + getCodice() + "\nDescrzione: " + getDescrizione() + "\nPrezzo: " + getPrezzo() + "\nScadenza: " + getScadenza();
	}
	
	@Override
	public double applicaSconto() {
		
		LocalDate now = LocalDate.now(); //Vado a clacolare la data odierna
		//long gg_dif = ChronoUnit.DAYS.between(now, scadenza);
		 if(ChronoUnit.DAYS.between(now, scadenza) >= 10) {
			 return super.applicaSconto();
		 }else {
			 return (getPrezzo() * 80)/100;
		 }
	}

}
