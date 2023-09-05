package Base;

import java.util.Scanner;

public class Esercizi_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		/*
		 * Esercizio 1:
		 * Scrivere un programma che chieda due numeri Double e ne stampi la somma
		 */
		
		double n1 = 5;
		double n2 = 12;
		
		System.out.println("la somma dei numeri è: " + (n1 + n2));
		
		/*
		 * Esercizio 2:
		 * 
		 * Scrivere un programma che chieda la base e l'esponente per effettuare un calcolo di elevazione apotenza
		 * 
		 */
		
		/*
		 * Esercizio 3:
		 * 
		 * Scrivere un programma che calcoli il minimo tra 3 numeri interi presi da tastiera
		 * 
		 */
		
		int es3_n1 = 4;
		int es3_n2 = 3;
		int es3_n3 = 7;
		
		int min = Math.min(Math.min(es3_n1, es3_n2), es3_n3);
		System.out.println("Il minimo è: " + min);
	}

}
