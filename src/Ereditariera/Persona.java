package Ereditariera;

public class Persona {
	
	//Dichiaro le proprietà della classe
	private String nome;
	private String cognome;
	private int eta;
	private String residenza;
	private String telefono;
	
	//Creo il costruttore della classe
	public Persona(String nome, String cognome, int eta, String residenza, String telefono) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta > 13 ? eta : 13;
		this.residenza = residenza;
		this.telefono = telefono;
		
		
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected String getCognome() {
		return cognome;
	}

	protected void setCognome(String cognome) {
		this.cognome = cognome;
	}

	protected int getEta() {
		return eta;
	}

	protected void setEta(int eta) {
		this.eta = eta > 13 ? eta : 13;
	}

	protected String getResidenza() {
		return residenza;
	}

	protected void setResidenza(String residenza) {
		this.residenza = residenza;
	}
	
	
	
	protected String getTelefono() {
		return telefono;
	}

	protected void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	//Metodi della classe Padre
	public String saluta() {
		return "Ciao da " + nome + " " + cognome;
	}

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + ", eta=" + eta + ", residenza=" + residenza + "]";
	}
	
	public String presenta() {
		return "Presenta";
	}
	
	
}
