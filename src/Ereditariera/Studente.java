package Ereditariera;

public class Studente extends Persona {

	//Prorprità della classe
	private String classe;
	
	public Studente(String nome, String cognome, int eta, String residenza, String telefono, String classe) {
		super(nome, cognome, eta, residenza, telefono); //Richiama il costruttore della classe Persona
		this.classe = classe;
		
	}

	protected String getClasse() {
		return classe;
	}

	protected void setClasse(String classe) {
		this.classe = classe;
	}
	
	

	@Override
	public String toString() {
		return "Studente [classe=" + classe + ", toString()=" + super.toString() + "]";
	}

	//Per sovrascrivere un metodo del padre devo usare il decoratore @Override
	@Override
	public String saluta() {
		return "Buongiorno solo l'alunno : " + getNome() + " " + getCognome() + " della " + classe;
	}

	
}
