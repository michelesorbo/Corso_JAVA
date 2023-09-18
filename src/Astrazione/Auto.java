package Astrazione;

public class Auto extends Veicolo {
	
	private String cilindrata;

	public Auto(String modello, int annoCostruzione, String cilindrata) {
		super(modello, annoCostruzione);
		this.cilindrata = cilindrata;
	}

	protected String getCilindrata() {
		return cilindrata;
	}

	protected void setCilindrata(String cilindrata) {
		this.cilindrata = cilindrata;
	}

	@Override
	public String toString() {
		return "Auto [cilindrata=" + cilindrata + ", getModello()=" + getModello() + ", getAnnoCostruzione()="
				+ getAnnoCostruzione() + "]";
	}

	@Override
	void frena() {
		System.out.println("Premo il pedale e scalo di marcia");
		
	}

	@Override
	String muovi() {
		// TODO Auto-generated method stub
		return "Metto la prima e accellero";
	}
	
	

}
