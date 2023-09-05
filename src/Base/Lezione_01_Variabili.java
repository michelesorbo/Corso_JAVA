package Base;

import java.util.Scanner;

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
		
		String cognome;
		
		//Vado a dichiarare un oggetto di tipo Scanner Input per poter acquisire informazioni da tastiera
		Scanner input = new Scanner(System.in);
		
		//Esempio di informazione presa da tastiera
		System.out.println("Inserisi il tuo congnome");
		cognome = input.nextLine(); //Vado a prendere i valori inseriti da tatiera
		System.out.println("Il congome inserito è: " + cognome);
		
		System.out.println("Inserisci il tuo numero preferito");
		int numero_preferito = input.nextInt(); //Vado a prendere un numero intero dalla tastiera
		
		System.out.println("Il tuo numero preferito è: " + numero_preferito);
		
		/*
		 * Esercizio:
		 * Chiedere di inserire il nome, cognome ed età e far stamapre tutti in un unica riga
		 * 
		 * es:
		 * Inserisci il tuo nome:
		 * Michele
		 * 
		 * Inserisci il tuo congome:
		 * Sorbo
		 * 
		 * Inserisci la tua età:
		 * 44
		 * 
		 * Nome: Michlele Cognome: Sorbo Età: 44
		 */

		System.out.println("Inserisci il tuo nome:");
		String nome_es = input.nextLine();
		
		System.out.println("Inserisci il tuo congnome:");
		String cognome_es = input.nextLine();
		
		System.out.println("Inserisci la tua età:");
		int eta_es = input.nextInt();
		
		System.out.println("Nome: " + nome_es + " Cognome: " + cognome_es + " Età: " + eta_es);
		
		
		
		//Costanti
		//A differenza delle variabili le costanti non possono essere modificate dopo averle dichiarate
		/*
		 * 1) Le costanti si scrivono sempre tutto in MAIUSCOLO
		 * 
		 * 2) Si devono sia dichiarare che inizializzare contemporaneamente
		 * 
		 * 3) Prima del tipo per dichiarare una costante inserisco la key final		
		 */
		
		final double PIGRECO = 3.14;
		
		final String nomeSocietà = "TalentForm";
		
	}
	
	

}
