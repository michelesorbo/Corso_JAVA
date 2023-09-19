package Interfacce;

public class Leone extends Animale implements Predatore {
	
	String criniera;
	
	Leone(String nome, String criniera) {
		super(nome);
		this.criniera = this.pulisciStringa(criniera);
	}

	protected String getCriniera() {
		return criniera;
	}

	protected void setCriniera(String criniera) {
		this.criniera = criniera;
	}

	@Override
	public String toString() {
		return "Leone [criniera=" + criniera + ", getNome()=" + getNome() + "]";
	}

	@Override
	public String caccia() {
		return "inizio la caccia" + this.es;
	}
	
	
	
	
	

}
