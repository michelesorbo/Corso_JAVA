package Base;

public class Lezione_14_Funzioni {

	public static void main(String[] args) {
		
		//Una funzione serve a ripetere un blocco di codice ogni volta che viene invocata
		
		//La funzione per essere visibile deve essere invocata nel main
		saluta(); //Ho invocato la funzione saluta
		saluta();
		saluta();
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		saluta();
		
//		System.out.println("Ciao sono Michele");
//		System.out.println("Ciao sono Vincenzo");
//		System.out.println("Ciao sono Emidio");
		
		salutaNome("Michele"); //salutaNome(nome = "Michele")
		salutaNome("Vincenzo");
		String nome = "Emidio";
		salutaNome(nome); //Alla funzione viene passato il contenuto della vqariabile nome (viene passato il valore della variabile nome)
		System.out.println(nome);//Cosa stampa ?
		
		somma(7,9); //somma(a = 7, b = 9)
		somma(13,45);
		int n1 = 3,n2=5;
		somma(n1,n2); //somma(a=n1,b=n2) -> somma(a=3,b=5)
	}
	
	//FUORI DALLA FUNZIONE MAIN POSSO CREARE NUOVE FUNZIONI
	
	//Per creare una funzione che possa essere richiamata all'interno drella stessa classe devo inserire static
	//Una funzione si scrive seguendo le seguenti regole
	//1) Visibilità della funzione 
	//2) (opzionale) static, se la devo far eseguire nella stessa classe
	//3) tipo di ritorno, se non sono previssti ritorni si scrive void
	//4) il nome della funzione
	//5) eventuali parametri
	
	//Una funzione semplice non ha parametri e non ha ritorno
	public static void saluta() {
		//Vado a scrivere tutti i comandi della funzione
		System.out.println("Ciao Mondo");
		System.out.println("Ciao Classe");
	}
	
	//Funzione senza ritorno ma con parametro
	public static void salutaNome(String nome) {
		System.out.println("Ciao da " + nome);
	}
	
	//Per passare più parametri ad una funzione separari i parametri con un ,
	public static void somma(int a, int b) {
		System.out.println("La somma è: " + (a+b));
	}

}
