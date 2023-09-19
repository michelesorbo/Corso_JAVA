package Interfacce;

public class Animale implements GestioneStringhe {

	//Proprietà della classe
	private String nome;
	
	//Costruttore della classe
	Animale(String nome){
		this.nome = nome;
	}
	
	//Incapsulamneto
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//toString per non far vedere la posizione nella memoria
	public String toString() {
		return "Nome: " + this.nome;
	}
	
	
	
}
