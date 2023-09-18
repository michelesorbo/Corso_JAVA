package Astrazione;

public abstract class Veicolo {

	private String modello;
	private int annoCostruzione;
	
	public Veicolo(String modello, int annoCostruzione) {
		this.modello = modello;
		this.annoCostruzione = annoCostruzione;
	}

	protected String getModello() {
		return modello;
	}

	protected void setModello(String modello) {
		this.modello = modello;
	}

	protected int getAnnoCostruzione() {
		return annoCostruzione;
	}

	protected void setAnnoCostruzione(int annoCostruzione) {
		this.annoCostruzione = annoCostruzione;
	}

	@Override
	public String toString() {
		return "Veicolo [modello=" + modello + ", annoCostruzione=" + annoCostruzione + "]";
	}
	
	//Metodi astratti
	abstract String muovi();
	abstract void frena();
	
	
}
