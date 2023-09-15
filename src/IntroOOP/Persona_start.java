package IntroOOP;

public class Persona_start {

	public static void main(String[] args) {
		
		//Voglio usare la classe Persona per definire un nuovo utente
		
		//Per prima cosa dichiaro una variabile di tipo persona. Questa operazione fa si che la varibile
		//Diventi istanza della classe Persona cioè oggetto della classe.

		Persona u1 = new Persona("Emidio","Carleo",19,"EMD001"); //Ho dichiarato un oggetto della classe Persona. Termine tecnico è istanziare
		Persona u2 = new Persona("Alessio", "Leodori",19,"ALS001");
		Persona u3 = new Persona("Nicola", "Martiradonna");
		
//		u1.nome = "Emidio";
//		u1.cognome = "Carleo";
//		u1.eta = 19;
//		u1.cf = "EMD001";
//		
//		u2.nome = "Alessio";
		
		System.out.println(u1.nome);
		System.out.println(u2.cf);
		u1.saluta();
		u2.saluta();
	}

}
