package esercizi_base;

import java.util.Scanner;

public class Esercizio_3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double prezzo;
		int sconto, scelta;
		
		do {
			System.out.println("Scegli\n1) Calcola Sconto \n2) Chiudi Programma");
			scelta = in.nextInt();
			
			if(scelta == 1) {
				System.out.println("Inserisci il prezzo del prodotto");
				prezzo = in.nextDouble();
				
				System.out.println("Inserisci la percentuale di sconto");
				sconto = in.nextInt();
				
				calcolaSconto(prezzo,sconto);
			}else if(scelta == 2) {
				System.out.println("Chiudo programma");
			}else {
				System.out.println("Scelta non valida");
			}
		}while(scelta != 2);
		

	}
	
	public static void calcolaSconto(double prezzo, int sconto) {
		if(sconto >= 0 && sconto <= 100) {
			double prezzo_scontato = (prezzo * (100 - sconto))/100;
			System.out.println("Il prezzo scontato è: " + prezzo_scontato + "€");
		}else {
			System.out.println("Lo sconto è furi dai range");
		}
		
	}

}
