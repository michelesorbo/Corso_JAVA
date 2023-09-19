package Interfacce;

public class Pesce extends Animale implements Preda, Predatore {

	private int n_pinne;
	
	
	public Pesce(String nome, int n_pinne) {
		super(nome);
		this.n_pinne = n_pinne;
	}
	
	

	protected int getN_pinne() {
		return n_pinne;
	}



	protected void setN_pinne(int n_pinne) {
		this.n_pinne = n_pinne;
	}


	@Override
	public String toString() {
		return "Pesce [n_pinne=" + n_pinne + ", getNome()=" + getNome() + "]";
	}



	@Override
	public String caccia() {
		return "Nasconditi e aspetta la preda";
	}

	@Override
	public String scappa() {
		return "Nuota veloce";
	}

}
