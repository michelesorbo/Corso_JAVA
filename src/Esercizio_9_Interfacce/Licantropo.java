package Esercizio_9_Interfacce;

public class Licantropo extends Personaggio implements Umano, Mostro {

	private boolean isUomo;
	protected int forzaMostro, forzaUmano;
	public Licantropo(String nome, boolean isUomo) {
		super(nome);
		this.isUomo = isUomo;
		if(this.isUomo) {
			this.forzaMostro = 0;
			this.forzaUmano = 10;
		}else {
			this.forzaMostro = 15;
			this.forzaUmano = 0;
		}
		
	}
	@Override
	public void azzanna() {
		if(!isUomo) {
			this.forzaMostro -= 3;
		}
		
	}
	@Override
	public void combatti() {
		if(isUomo) {
			this.forzaUmano -= 2;
		}
		
	}
	@Override
	public String getForza() {
		if(isUomo) {
			return "Forza restante Licantropo Uomo: " + this.forzaUmano;
		}else {
			return "Forza restante Licantropo Mostro: " + this.forzaMostro;
		}
	}
	
	
	
	
	
}
