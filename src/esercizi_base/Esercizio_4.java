package esercizi_base;

import java.util.Scanner;

public class Esercizio_4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n1,n2,scelta;
		
		do {
			System.out.println("Cosa vuoi fare: \n1) Somma \n2) Sottrazione \n3) Moltiplicazione \n4) Divisione\n5) Esci");
			scelta = in.nextInt();
			
			System.out.println("Inserisci il primo numero");
			n1 =in.nextInt();
			
			System.out.println("Inserisci il secondo numero");
			n2 =in.nextInt();
			
			if(scelta == 1) {
				somma(n1,n2);
			}else if(scelta ==2) {
				sottrazione(n1,n2);
			}else if(scelta == 3) {
				moltiplicazione(n1,n2);
			}else if(scelta == 4) {
				divisione(n1,n2);
			}else if(scelta == 5) {
				System.out.println("Chiudo il programma");
			}else {
				System.out.println("Scelta non valida");
			}
		}while(scelta != 5);
		
		/*
		 * Esercizio 4: FUNZIONI SENZA RITORNO
		Creare 4 funzioni una per la somma di 2 interi, una per la sottrazione di 2 interi, una per la moltiplicazione di 
		2 interi e una per la divisione di 2 interi.
		
		Per la divisione controllare se il secondo parametro è diverso da 0.
		
		Nella funzione mail creare un ciclo per far scegliere quale operazione compiere e inserire l'ozione di uscita


		 */
		
		somma(5,7);

	} //Fine main
	
	//Inizio Funzioni
	public static void somma(int a, int b) {
		System.out.println("La somma è: " + (a+b));
	}
	
	public static void sottrazione(int a, int b) {
		System.out.println("La sottrazione è: " + (a-b));
	}
	
	public static void moltiplicazione(int a, int b) {
		System.out.println("La moltiplicazione è: " + (a*b));
	}
	
	public static void divisione(int a, int b) {
		if(b != 0) {
			System.out.println("La divisione è: " + (a/b));
		}else {
			System.out.println("Divisione impossibile");
		}
	}
	
	

}
