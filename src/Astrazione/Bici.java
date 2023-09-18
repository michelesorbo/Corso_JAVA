package Astrazione;

public class Bici extends Veicolo {

	private String tipoMannubrio;

	public Bici(String modello, int annoCostruzione, String tipoMannubrio) {
		super(modello, annoCostruzione);
		this.tipoMannubrio = tipoMannubrio;
	}

	protected String getTipoMannubrio() {
		return tipoMannubrio;
	}

	protected void setTipoMannubrio(String tipoMannubrio) {
		this.tipoMannubrio = tipoMannubrio;
	}

	@Override
	public String toString() {
		return "Bici [tipoMannubrio=" + tipoMannubrio + ", getModello()=" + getModello() + ", getAnnoCostruzione()="
				+ getAnnoCostruzione() + "]";
	}
	
	@Override
	public void frena() {
		System.out.println("Smetto di pedalare e tiro la leva del freno");
	}
	
	public String muovi() {
		return "Inizio a pedalare";
	}
}
