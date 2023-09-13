package esercizi_base;

import java.util.Random;

public class Esercizio_8 {

	public static void main(String[] args) {
		//Creo 2 array di dimensioni diverse
		
		int[] ar_n1 = new int[10];
		int[] ar_n2 = new int[4];
		
		popolaArray(ar_n1);
		popolaArray(ar_n2);

		System.out.println("Primo AR");
		stampaAR(ar_n1);
		
		System.out.println("Secondo AR");
		stampaAR(ar_n2);
		
		System.out.println("La somma degli elementi del primo ar è: " + sommaAR(ar_n1));
		System.out.println("La somma degli elementi del secondo ar è: " + sommaAR(ar_n2));
	}
	
	public static void popolaArray(int[] ar) {
		Random rm = new Random();
		
		//Vado a scorrere tutti gli elementi dell'array
		for(int i = 0; i < ar.length; i++) {
			ar[i] = rm.nextInt(100); //Vado ad inserire un numero casuale tra 0 e 99
		}
		
		
	}
	
	public static void stampaAR(int[] ar) {
		for(int el:ar) {
			System.out.println(el);
		}
	}
	
	public static int sommaAR(int[] ar) {
		int somma = 0;
		
		for(int el:ar) {
			somma += el;
		}
		
		return somma;
	}

}
