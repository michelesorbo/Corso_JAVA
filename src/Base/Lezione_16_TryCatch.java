package Base;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lezione_16_TryCatch {

	public static void main(String[] args) {
		
		/*
		 * Il Try catch serve a gestire gli errori in determinate occasioni
		 */
		
		Scanner in = new Scanner(System.in);
		int[] ar = {2,5,7}; 
		
		int n1, n2, risultato, indice;
		
		try {
			System.out.println("Inserisci un numero:");
			n1 = in.nextInt(); //Si scatena l'errore
			
			System.out.println("Inserisci il seocndo numero");
			n2 = in.nextInt();
			
			risultato = n1/n2;
			
			System.out.println("Il risultato è: " + risultato);
			
		}catch(InputMismatchException e) { //Cattoru gli errori di input imprevisti
			System.out.println("Puoi inserire solo numeri");
			
		}catch(ArithmeticException e) { //Erorri di calcolo artmetici
			System.out.println("Non puoi dividere per 0");
			
		}catch(Exception e){ //Catturo erroti generici che non ho previsto
			System.out.println("errore di tipo " + e);
			
		}finally { //è un codice che viene sempre eseguito Sia che va tutto bene sia se incontro un catch
			//non è obbligatorio
			//Inserisco le cose che devo chiudere sia se il codice va a buon fine sia che fallisce
			System.out.println("sono finally");
			//in.close();//Chiudo il flusso di input
		}
		
		
		try {
			System.out.println("Inserisci un indice e scopri il numero");
			indice = in.nextInt();
			
			System.out.println(ar[indice]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Errore indice non trovato");
		}
		
		
		
		System.out.println("Eseguo dopo tray");

	}

}
