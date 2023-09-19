package Esercizio_9_Interfacce;

public abstract class Personaggio {
	
	private String nome;

	public Personaggio(String nome) {
		this.nome = nome;
	}

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}
	
	abstract public String getForza();
	
	
}
