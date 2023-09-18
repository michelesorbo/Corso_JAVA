package Ereditariera;

public class Segretario extends Persona{

	private String stanza;
	
	public Segretario(String nome, String cognome, int eta, String residenza,String telefono, String stanza) {
		super(nome, cognome, eta, residenza, telefono);
		this.stanza = stanza;
	}

	protected String getStanza() {
		return stanza;
	}

	protected void setStanza(String stanza) {
		this.stanza = stanza;
	}
	
	

}
