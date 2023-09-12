package Base;

import java.util.Scanner;

public class Lezione_12_Cast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int n1 = 3;
		String n2 = "4";
		char n3 = '5';
		
		//Per conoscere il tipo di variabile si usa .getClass
		System.out.println(n2.getClass());
		
		
		System.out.println(n1 + Integer.parseInt(n2)); //Convertire una stringa in intero

		System.out.println(n1 + (int)n3); //Attenzione che non è 5
		System.out.println(Character.getNumericValue(n3)); //Convertire un char in int
		System.out.println(n1 + Character.getNumericValue(n3));
	
		//Da intero a Stringa
		int n_int1 = 5;
		int n_int2 = 4;
		String n_string = n_int1 + ""; //Fatta la conversione da intero a stringa
		
		System.out.println(n_int1 + "" + n_int2);
		
		System.out.println("Ciao " + n_int1);
		
		/*
		 * Es1: 
		 * Chiedere all'utente di inserire dei numeri da tastiera e dividerli con uno spazzio
		 * 
		 * il programma restituirà la somma dei numeri inseriti
		 * 
		 * es:
		 * Inserisci i numeri separati da uno spazzio-> 3 54 1
		 * La somma dei numeri inseriti è: 58
		 * 
		 * 
		 * Es2: 
		 * Aggiungere anche la media
		 */
		
		System.out.println("Inserisci i numeri separati da una virgola");
		String numeri = in.nextLine();
		
		String[] numeri_ar = numeri.trim().replace(" ", "").split(",");
		
		System.out.println(numeri_ar.length);
		int somma = 0;
		
		//Faccio il forEach per sommare tutti gli elementi dell'array
		for(String el:numeri_ar) {
			somma += Integer.parseInt(el);
		}
		
		System.out.println("La somma dei numeri inseriti è: " + somma);
		System.out.println("La media dei numeri: " + (somma/numeri_ar.length));
	}

}
