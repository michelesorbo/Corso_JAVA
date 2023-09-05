package Base;

public class Lezione_01_Variabili {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * In JAVA ci sono i tipi di dati primitivi e sono:
		 * 
		 * int per i numeri interi es 1, 2, 99, -4, -100. Questi si scrivono senza apici
		 * 
		 * String che servono a memorizzare parole o frasi. Si scrivono tra doppi apici "Stringa"
		 * 
		 * char per i signololi caratteri. Serve a memorizzare un singolo carattere es: a, b, r. Si scrivono tra singolo apice 'c'.
		 *  
		 * float o Double servono a memorizzare numeri con la virgola. Si scrivono sneza apici
		 * 
		 * booleani servono a memorizzare solo true o false
		 * 
		 */
		
		/*
		 * Regole per la scrittura dei nome della variabili
		 * 
		 * 1) La variabile si scrive sempre con iniziale minuscola
		 * 
		 * 2) Non è possibile inserire spazzi nei nomi delle variabili 
		 * es anno di nascita diventa:
		 * 
		 * Metodo con _ = anno_di_nascita
		 * Metodo Camel Case = (Inizio sempre con la lettera minuscola) annoDiNascita
		 * 
		 * 3) Non iniziare mai con un numero
		 * 
		 * 4) Non chiamare una variabile con un nome di sistema es(int for, int while)
		 */
		
		//Prima di utilizzare una variabile la devo dichiarare
		//Per dichiarare una variabile vado a inserire prima il tipo di variabile e poi inserisco il nome della variabile
		
		int eta; //Dichiaro la varibile età di tipo intero
		
		//Inizializzare una varible significa assegnare un valore alla variabile
		eta = 44; //Inizializzo (o assegno il valore) la variabile con il numero 44
		
		System.out.println(eta);
		
		eta = 32; //Vado a cambiare il contenuto della variabile
		
		System.out.println(eta);
		
		int annoNascita = 1979; //Ho sia dichiarato che inizializzato una variabile
		
		System.out.println(annoNascita);
		
		String nome = "Michele";
		
		System.out.println(nome);
		
		//Come unire delle variabili nel system.out. Questa tecnica si chiama concatenazione
		System.out.println("Piacere mi chiamo " + nome + " e ho " + eta + " quindi sono nato nel " + annoNascita);
		
		//Dichiaro una variabile di tipi char (Carattere)
		char carattere = 'c'; //Posso inserire un solo carattere
		char numero = '1'; //Attenzione questo non è il numero 1 ma il carattere 1
		
		//Dichiaro una variabile booleana può essere solo o vera o falsa (o true o false)
		boolean bool = true;
		
		//Valori numerici con le virgole
		double mille = 1000.0;
		System.out.println(mille);
		float milleFloat = 1000.0f;
		System.out.println(milleFloat);
		

	}

}
