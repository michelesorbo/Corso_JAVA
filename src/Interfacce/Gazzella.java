package Interfacce;

public class Gazzella extends Animale implements Preda {

	String corna;
	
	public Gazzella(String nome, String corna) {
		super(nome);
		this.corna = corna;
	}

	protected String getCorna() {
		return corna;
	}

	protected void setCorna(String corna) {
		this.corna = corna;
	}
	
	

	@Override
	public String toString() {
		return "Gazzella [corna=" + corna + ", getNome()=" + getNome() + "]";
	}

	@Override
	public String scappa() {
		return "Inizia a correre";
	}

}
