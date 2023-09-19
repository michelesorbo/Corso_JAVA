package Esercizio_9_Interfacce;

public class Eroe extends Personaggio implements Umano {

	protected int forza;

	public Eroe(String nome) {
		super(nome);
		this.forza = 10;
	}

	@Override
	public void combatti() {
		forza -= 3;
		
	}

	@Override
	public String getForza() {
		
		return "La forza dell'umano " + getNome() + " è di " + forza;
	}
	
	
}
