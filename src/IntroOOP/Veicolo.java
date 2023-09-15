package IntroOOP;

public class Veicolo {

	//Inserire la proprietà costo di tipo private e int.
	//Creare un metodo vediCosto che staperà a video il costo dell'auto e se:
	//Lo stato è Nuovo aggiungere 300€ per immatricolazione + 500€ per messa in strada
	//Lo stato è usato aggiungere solo 300€ per passaggio di proprietà
	
	
	//Per ogni auto Aggiungere un costo medio per km.
	//Creare un metodo che ricevuti il numeo di km percorsi calcola il costo del viaggio
	
	public String targa;
	public String modello;
	public String proprietario;
	private String stato;
	private int costo;
	private double consumo_km;
	
	Veicolo(String targa, String modello, String proprietario, int costo, double consumo_km){
		this.targa = targa;
		this.modello = modello;
		this.proprietario = proprietario;
		this.stato = "Usata";
		this.costo = costo;
		this.consumo_km = consumo_km;
	}
	
	Veicolo(String targa, String modello, int costo, double consumo_km){
		this.targa = targa;
		this.modello = modello;
		this.proprietario = "";
		this.stato = "Nuova";
		this.costo = costo;
		this.consumo_km = consumo_km;
	}
	
	//Creo il metodo per visualizzare lo stato che è di tipo private
	public String vediStato() {
		if(stato == "Nuova") {
			return "L'auto costa " + costo + " + 300€ per immatricolazione + 500€ per messa in strada";
		}else {
			return "L'auto costa " + costo + " + 300€ per passaggio di proprietà";
		}
	}
	
	public String costoViaggio(double km) {
		return (km * consumo_km) + "€";
	}
	
	
}
