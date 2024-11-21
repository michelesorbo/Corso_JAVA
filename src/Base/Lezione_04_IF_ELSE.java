package Base;

import java.util.Scanner;

public class Lezione_04_IF_ELSE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		/*
		 * Il costrutto IF serve a far eseguire un codice se la condizione è verificata (true)
		 * 
		 * Non tutti gli IF hanno un else
		 */
		int n1 = 4, n2 = 5;
		
		System.out.println(n1 > n2);
		
		if(n1 > n2) {
			System.out.println("Condizione Vera");
		}
		
		System.out.println("Testo dopo IF");
		
		//Caso IF ELSE
		if(n1 > n2) { //Viene eseguito se la condizione è vera
			System.out.println("Sono if di condizione verificata");
		} else { //Viene eseguita se la condizione è falsa
			System.out.println("Sono if di condizione non verificata");
		}
		
		System.out.println("Continuo dopo secondo IF");
		
		/*
		 * Chiedere un numero all'utente, sel il numero è maggiore di 10 scrivere numero maggiore altrimenti numero minore
		 * es:
		 * Inserisci un numero: 12
		 * Numero inserito maggiore di 10 
		 */
		
//		System.out.println("Inserisci un numero:");
//		int es1_n = in.nextInt(); //Ricordo il numero inserito da tastiera.
//		
//		//Faccio il confronto e verifico se è vero
//		if(es1_n > 10) {
//			System.out.println("Numero inserito è maggiore di 10");
//		}else {
//			System.out.println("Il numeor è inferiore");
//		}
		
		/*
		 * 
		 * Costrutto IF - ELSE IF - ELSE
		 * 
		 * Si applica quando devo verificare più condizioni sulla stessa variabile
		 * 
		 * TUTTI GLI IF ELSE IF TEMINANO CON UN ELSE
		 * 
		 * Posso aggiunger tanto else if quanti ne servono
		 * 
		 */
			
		//Voglio verificare se il numero è maggiore minore o uguale a 10
		int n_es1 = 9;
		
		if(n_es1 > 10) { //Verifico se il numero è maggiore di 10
			System.out.println("Numero maggiore di 10");
			System.out.println(Math.pow(n_es1, 3));
		}else if(n_es1 < 10) { //Verifico se è minro di 10
			System.out.println("Numero minore di 10");
		}else {
			System.out.println("Numero uguale a 10");
		}
		
		/*
		 * Esempio:
		 * 
		 * Data l'ora scrivere se è mattina, pomeriggio, sera, notte.
		 * 
		 * Dalle 6 fino alle 12 è mattina
		 * 
		 * Dalle 12 fino alle 16 pomeriggio
		 * 
		 * Dalle 16 fino alle 22 sera.
		 * 
		 * Dalle 22 in poi è notte.
		 * 
		 */
		
		int ora = 23;
		
		if(ora >= 22) {
			System.out.println("Notte");
		}else if(ora >= 16) {
			System.out.println("Sera");
		}else if(ora >= 12) {
			System.out.println("Pomeriggio");
		}else {
			System.out.println("Mattina");
		}
		
		System.out.println("Menu: \n1) Primo \n2) Secondo"); //Il carattere speciale \n serve ad andare a capo nella console
		
		/*
		 * 
		 * Chiedere all'utente di inserire 2 numeri per la divisione.
		 * 
		 * Se il seocndo numero è uguale a 0 dire divisione non valida, altrimenti mostrare il risultato.
		 * 
		 * I numeri devono essere double.
		 * 
		 */
		
		System.out.println("inserisci il primo numero: ");
		double es1_n1 = in.nextDouble(); 
		
		System.out.println("inserisci il primo numero: ");
		double es1_n2 = in.nextDouble();
		
		if(es1_n2 != 0) {
			System.out.println("il risultato è: " + (es1_n1 / es1_n2));
		}else {
			System.out.println("Non posso diviedere per 0");
		}
		
		/*
		 * Chiedere all'utente quale operazione vuole svolgere. Dopo la scelta chiedere i due numeri e visualizzare il risultato
		 * 
		 * ES:
		 * Scegli un operazione, digita:
		 *  
		 * 1 - per la somma
		 * 2 - per la sottrazione
		 * 3 - per la moltiplicazione
		 * 4 - per la divisione. Ricordati di verificare se il secondo numero è 0
		 * 
		 * In caso di scelta non valida, quindi diversa da 1, 2, 3 o 4 dire scelta non valida
		 */
		
		int es_n1,es_n2, scelta;
		//System.out.println("Scegli un operazione, digita: \n1 - somma \n2 - sottrazione \n3 - moltiplicazione \n4 - divisione");
		
//		scelta = in.nextInt();
//		
//		if(scelta == 1) {
//			System.out.println("Hai scelto la somma Somma");
//			
//			System.out.println("Inserisci il primo numero");
//			es_n1 = in.nextInt();
//			
//			System.out.println("Inserisci il secondo numero");
//			es_n2 = in.nextInt();
//			
//			System.out.println("La somma è: " + (es_n1+es_n2));
//		}else if(scelta == 2) {
//			System.out.println("Hai scelto la Sottrazione");
//			
//			System.out.println("Inserisci il primo numero");
//			es_n1 = in.nextInt();
//			
//			System.out.println("Inserisci il secondo numero");
//			es_n2 = in.nextInt();
//			
//			System.out.println("La sottrazione è: " + (es_n1-es_n2));
//		}else if(scelta == 3) {
//			System.out.println("Hai scelto la Moltiplicazione");
//			
//			System.out.println("Inserisci il primo numero");
//			es_n1 = in.nextInt();
//			
//			System.out.println("Inserisci il secondo numero");
//			es_n2 = in.nextInt();
//			
//			System.out.println("La moltiplicazione è: " + (es_n1*es_n2));
//		}else if(scelta == 4) {
//			System.out.println("Hai scelto la Divisione");
//			System.out.println("Inserisci il primo numero");
//			es_n1 = in.nextInt();
//			
//			System.out.println("Inserisci il secondo numero");
//			es_n2 = in.nextInt();
//			
//			if(es_n2 != 0) {
//				System.out.println("Il risultato della divisione è: " + (es_n1 / es_n2));
//			}else {
//				System.out.println("Non posso dividere per 0");
//			}
//			
//		}else {
//			System.out.println("Scelta non valida");
//		}
		
		//SOluzione alternativa con una richiesta dei numeri
		
		
		System.out.println("Scegli un operazione, digita: \n1 - somma \n2 - sottrazione \n3 - moltiplicazione \n4 - divisione");
		
		scelta = in.nextInt();
		
		if(scelta > 4) {
			System.out.println("Scelta non valida");
		}else if(scelta <= 0) {
			System.out.println("Scelta non valida");
		}else{
			
			System.out.println("Inserisci il primo numero");
			es_n1 = in.nextInt();
			
			System.out.println("Inserisci il secondo numero");
			es_n2 = in.nextInt();
			
			if(scelta == 1) {
				System.out.println("Hai scelto la somma Somma");
				
				System.out.println("La somma è: " + (es_n1+es_n2));
			}else if(scelta == 2) {
				System.out.println("Hai scelto la Sottrazione");
				
				System.out.println("La sottrazione è: " + (es_n1-es_n2));
			}else if(scelta == 3) {
				System.out.println("Hai scelto la Moltiplicazione");
				
				System.out.println("La moltiplicazione è: " + (es_n1*es_n2));
			}else {
				System.out.println("Hai scelto la Divisione");
				
				if(es_n2 != 0) {
					System.out.println("Il risultato della divisione è: " + (es_n1 / es_n2));
				}else {
					System.out.println("Non posso dividere per 0");
				}
			}
			
			
		} //Chiudo Else


		/*
		 * Calcola lo sconto di un articolo
		 * 
		 * Se il prezzo dell'articolo supera i 100€ applicare uno sconto del 25%.
		 * 
		 * Se la condizione è vera far visualizzare il prezzo scontato altrimenti far visualizzare Prodotto non in sconto
		 */
		
		System.out.println("Inserisci il prezzo del capo: ");
		double prezzo = in.nextDouble();
		
		if(prezzo >= 100) {
			System.out.println("Il prezzo scontato è: " + (prezzo * 0.75) + "€");
		}else {
			System.out.println("Il capo non è in sconto.");
		}
		
		/*
		 * 
		 * Chiedere un numero intero da tastiera e dire se è pari o dispari
		 * 
		 */
		
		System.out.println("inserisci un numero e ti dirò se è pari o dispari");
		
		int es2_n = in.nextInt();
		
		if(es2_n%2 == 0) {
			System.out.println("Numero Pari");
		}else {
			System.out.println("numero Dipsari");
		}
		
				
	}

}
