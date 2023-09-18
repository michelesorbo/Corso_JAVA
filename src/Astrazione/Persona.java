package Astrazione;

public abstract class Persona {

	/*
	 * Le classi astratte possono avere motodi astratti.
	 * 
	 * I metodi astratti sono metodi che iniziano con la parola abstract e hanno solo il ritorno e il nome ed eventualli parametri
	 * 
	 * Le classi astratte non pososno essere usate per creare oggetti
	 * 
	 * Le classi che ereditano una classe astratta devono implementare tutti i metodi astratti 
	 * altrimenti saranno  anche loro classi astratte.
	 * 
	 * Le classe che implementano un medoto astratto devono seguire i ritorno e i parametri
	 * dichiarati nel metodo. Dopo possono creare un Overload del metodo con ritrni e parametri diversi
	 * 
	 */
	
	private String nome;
	private String cognome;
	
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
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

	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", cognome=" + cognome + "]";
	}
	
	abstract void saluta(); //Metodo astratto	
}
