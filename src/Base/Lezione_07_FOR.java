package Base;

import java.util.Scanner;

public class Lezione_07_FOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		/*
		 * Il costrutto FOR serve a ripetere un blococ di codice un determinato numero di volte
		 * 
		 * for(indice iniziale; condizione di uscita; incremento)
		 */
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("...10");
		
		int i;
		
		//Indice inizio - codizione di uscita - incremento dell'indice
		for(i = 1; i <= 10; i++) {
			System.out.println("Valore di i: " + i);
		}
		
		System.out.println("Valore di i all'uscita del for: " + i);

		
		/*
		 * Stampare la tabillina del 2.
		 * 
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 * ...
		 * 2 x 10 = 20
		 */
		
		int tabellina = 2;
		
		for(i = 1; i <= 10; i++) {
			System.out.println("2 x " + i + " = " + (tabellina*i));
		}
		
		/*
		 * Chiedere all'utente quale tabellina visualizzare.
		 * 
		 * Opzionale:
		 * chiedere da dove si vuole iniziare e dove vuoi finire
		 * 
		 * es: dove vuoi iniziare: 11
		 * Dove vuoi finire : 20
		 * 
		 * 5 x 11 = 55
		 * 5 x 12 = 60
		 * ...
		 * 5 x 20 = 100
		 * 
		 * es:
		 * Che tabellina vuoi vedere? 5
		 * 5 x 1 = 5
		 * 5 x 2 = 10
		 * ...
		 * 5 x 10 = 50
		 */
		
		//Versione semplice 
//		System.out.println("Quale tabellina vuoi visualizzare");
//		tabellina = in.nextInt();
//		
//		for(i = 1; i <= 10; i++) {
//			System.out.println(tabellina + " x " + i + " = " + (tabellina*i));
//		}
		
		//Versione difficile 
		System.out.println("Quale tabellina vuoi visualizzare");
		tabellina = in.nextInt();
		
		System.out.println("Da dove vuoi iniziare");
		int inizio = in.nextInt(); //Mio indice di partenza
		
		System.out.println("dove vuoi finiere");
		int fine = in.nextInt(); //Mia codizione di uscita
		
		//Controllo loop
		if(inizio <= fine) {
			for(i = inizio; i <= fine; i++) {
				System.out.println(tabellina + " x " + i + " = " + (tabellina*i));
			}
		}else {
			System.out.println("Inserisi una fine maggiore dell'inizio");
		}
		
		
		/*
		 * Esercizio 2:
		 * 
		 * Chiedere di inserire 5 numeri e dopo averli inseriti visualizzare la somma dei numeri inseriti
		 * 
		 */
		
		int somma = 0;
		int numero_in;
		
		for(i = 1; i <= 5; i++) {
			System.out.println("Inserisci un numero da sommare");
			numero_in = in.nextInt();//PRendo il numero da tastiera
			somma += numero_in; //somma = somma + numero_in;
		}
		
		System.out.println("La somma dei numeri inseriti è: " + somma);
		
		/*
		 * Esercizio 3
		 * 
		 * Chiedere di inserire 10 numeri e dopo l'inserimento dire quanti numeri pari sono stati inseriti
		 * Quanti numeri dispari sono stati inserirti
		 * La somma dei numeri dispari 
		 * La somma dei numeri pari
		 * La somma totale
		 * 
		 */
		
		
	}

}
