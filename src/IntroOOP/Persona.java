package IntroOOP;

public class Persona {

	/*
	 *Ogni classe ha delle proprietà.
	 *Tutte le proprietà devo definire la loro visibilità. Se non lo faccio di default saranno public
	 *
	 * Le visibilità sono di tre tipi:
	 * 
	 * Public = la proprietà sarà visibile a tutti
	 * Protected = la proprietà è visibile solo dalla classe e dai sui figli
	 * Private = La proprietà è visibile solo dalla classe
	 */
	
	//Definisco le proprietà della classe
	public String nome;
	public String cognome;
	public int eta;
	public String cf;
	
	//Se non creo un costruttore java assegnerà un costruttore di default
	//Che porrà tutte le proprietà al valore standard
	
	//Altrimenti vado a dichiarare un costruttore della classe. Per farlo basta scrivere il nome della classe con i parametri che accetta
	
	//Coatruttore della classe
	Persona(String nome, String cognome, int eta, String cf){
		//Devo assegnare i parametri ricevuti dal costruttore alle proprietà della classe
		//In caso di omonimia di variabili, posso riferirmi alla proprietà della classe con this.<nome_proprietà>
		
		this.nome = nome; //Vado ad assegnare il valore ricevuto come parametro alla proprietà della classe
		this.cognome = cognome;
		this.eta = eta;
		this.cf = cf;
		
	}
	
	//OVERLOAD del costruttore
	Persona(String nome, String cognome){
		this.nome = nome;
		this.cognome = cognome;
		this.eta = 0;
		this.cf = "";
	}
	
	
	//Un metodo non è altro che una funzione in OOP
	public void saluta() {
		System.out.println("Ciao da " + nome);
	}
	
}
