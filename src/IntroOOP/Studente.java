package IntroOOP;

public class Studente {

	private String nome;
	private String cognome;
	private String matricola;
	
	public Studente(String nome, String cognome, String matricola) {
		this.nome = pulisciTesto(nome);
		this.cognome = pulisciTesto(cognome);
		this.matricola = matricola;
	}

	public Studente(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	
	//toString() serve a definire cosa scrivere quando vinene richiamata la classe
	public String toString() {
		return "Nome: " + firstUpper(nome) + " Cognome: " + firstUpper(cognome) + " Matricola: " + matricola;
	}
	
	//Incapsulamento
	//Serve a gestire tutte le proprietà della classe tramite metodi chiamati get e set
	public String getNome() {
		return firstUpper(nome);
	}
	
	public void setNome(String nome) { //nome = "Vincenzo"
		this.nome = pulisciTesto(nome); //testo = nome -> testo = "Vincenzo"
	}
	
	public String getCognome() {
		return firstUpper(cognome);
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	
	//Metodi della classe
	
	public String pulisciTesto(String testo) {
		testo = testo.trim();
		testo = testo.toLowerCase();
		testo = testo.replace(",","");
		testo = testo.replace(".","");
		testo = testo.replace("  "," ");
		return testo;
	}
	
	public String firstUpper(String testo) {
		return testo.substring(0,1).toUpperCase() + testo.substring(1);
	}
	
	
}
