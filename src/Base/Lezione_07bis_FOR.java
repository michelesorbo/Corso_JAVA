package Base;

import java.util.Scanner;

public class Lezione_07bis_FOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		/*
		 * Inserire break e continue in un ciclo for
		 * 
		 * brack:
		 * 
		 * Qundo inseirsco la parola chiave break esco immediatamente dal for.
		 * Limitare l'uso del break nel codice. 
		 *
		 */
		int i;
		
		for(i = 1; i<=10; i++) {
			if(i == 5) {
				break;
			}
			
			System.out.println(i);
		}
		
		//Esercizio con break:
		/*
		 * Chiedere di inserire 5 numeri da tastiera e sommarli.
		 * 
		 * Se la somma supera i 50 uscire immediatamente
		 */

		/*
		System.out.println("Inserisci 5 numeri, esco prima se la somma supera i 50");
		
		int somma = 0; 
		
		for(i = 1; i <= 5; i++) {
			System.out.println("Inserisci il " + i + "° numero:");
			
			int num = in.nextInt(); //Prendo il numero da tastiera
			
			somma += num; //Aggiorno la somma
			
			//Controllo se la somma è maggiore di 50
			if(somma > 50) {
				System.out.println("Termino il for perchè hai superato il 50");
				break;
			}
			
		} //Fine del FOR
		
		System.out.println("La somma tatale è: " + somma);
		*/
		
		
		/*
		 * Continue
		 * 
		 * A differenza del Break il continue salta la singola iterazione ma continua nel for
		 * 
		 */
		
		for(i = 1; i <= 5; i++) {
			if(i == 3) {
				continue;
			}
			
			System.out.println(i);
		}
		
		//Stampa dei primi 10 numeri pari senza usare i+2 ma solo usando continue
		
		for(i = 1; i <= 10; i++) {
			if(i%2 != 0) {//Controllo se i è dispari
				continue;
			}
			System.out.println(i); //Stampo solo se i è pari
			
		}
		
		//Accenno for annidati
		int y;
		
		for(i = 1; i <= 5; i++) {
			for(y = 1; y <= 5; y++) {
				System.out.println("Indice i = " + i + " Indice y = " + y);
			}
		}
	}

}
