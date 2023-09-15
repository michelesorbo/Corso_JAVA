package IntroOOP;

public class Veicolo {

	//Inserire la proprietà costo di tipo private e int.
	//Creare un metodo vediCosto che staperà a video il costo dell'auto e se:
	//Lo stato è Nuovo aggiungere 300€ per immatricolazione + 500€ per messa in strada
	//Lo stato è usato aggiungere solo 300€ per passaggio di proprietà
	
	public String targa;
	public String modello;
	public String proprietario;
	private String stato;
	
	Veicolo(String targa, String modello, String proprietario){
		this.targa = targa;
		this.modello = modello;
		this.proprietario = proprietario;
		this.stato = "Usata";
	}
	
	Veicolo(String targa, String modello){
		this.targa = targa;
		this.modello = modello;
		this.proprietario = "";
		this.stato = "Nuova";
	}
	
	//Creo il metodo per visualizzare lo stato che è di tipo private
	public String vediStato() {
		return stato;
	}
	
	
}
