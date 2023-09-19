package Esercizio_9_Interfacce;

public class Vampiro extends Personaggio implements Mostro {

	private int forza;
	
	public Vampiro(String nome) {
		super(nome);
		this.forza = 15;
	}
	
	//Implementazione del metodo dell'interfaccia
	public void azzanna() {
		forza -= 2; //forza = forza -2
	}
	
	//Implementazione del metodo del padre
	public String getForza() {
		return "La forza rimanente del Vampiro " + getNome() + " è di " + forza;
	}
	
}
