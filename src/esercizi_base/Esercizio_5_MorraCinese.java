package esercizi_base;

import java.util.Random;
import java.util.Scanner;

public class Esercizio_5_MorraCinese {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//esito();
		
		
		System.out.println("Scrivi una fare e te la pulisco");
		String frase = in.nextLine();
		
		System.out.println("Frase pulita: " + pulisciStringa(frase));
		
		/*
	    Gioca alla morra cinese con il PC
	    Il sistema esce quando viene scritto fine
	    L'utente deve inserire Carta, Forbici o Sasso (non importa minuscole o maiscole)
	    Quando faccio un lancio devo conoscere l'esito (Vinto, Perso, Paraggio)
	    Quado finisco il gioco devo conoscere quate partite ho fatto e quante volte ho vinto perso o pareggiato
	     */

	}
	
	public static String pulisciStringa(String str) {
		str = str.trim();//Tolgo eventuali spazzi ad inizio e fine stringa
		str = str.toLowerCase(); //porto tutti icaratteri in minuscolo
		str = str.replace(",", ""); //Elimino le ,
		str = str.replace(".", ""); //Elimino i .
		str = str.replace("  ", " "); //Tolglo eventuali doppo spazzi con il singolo spazzio
		return str;
	}
	
	public static int esito(String player_giocata) {
		/*
		 * I ritorni sono:
		 * 1 - vinto
		 * 2 - perso
		 * 3 - pareggiato
		 */
		
		Random rm = new Random();
		
		String computer_giocata;
		
		String[] simboli = {"carta", "sasso","forbici"};
		
		computer_giocata = simboli[rm.nextInt(3)];
		System.out.println(computer_giocata);
		return 0;
		
	}

}
