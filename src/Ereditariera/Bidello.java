package Ereditariera;

public class Bidello extends Persona {

	private String area;
	
	public Bidello(String nome, String cognome, int eta, String residenza, String telefono, String area) {
		super(nome, cognome, eta, residenza, telefono);
		this.area =area;
	}

	protected String getArea() {
		return area;
	}

	protected void setArea(String area) {
		this.area = area;
	}
	
	


}
