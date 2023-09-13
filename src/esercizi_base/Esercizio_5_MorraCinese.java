package esercizi_base;

import java.util.Random;
import java.util.Scanner;

public class Esercizio_5_MorraCinese {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String giocata;
		int vittorie = 0, pareggi = 0, sconfitte = 0;
		
		do {
	  		System.out.println("Gioca con me. \nScrivi carta, sasso o forbici\nScrivi fine per uscire");
	  		giocata = in.nextLine();
	  		
	  		giocata = pulisciStringa(giocata); //Vado a pulire quello che inserisce l'utente
	  		
	  		//Controllo se l'utente ha giocato uno dei simboli consentiti
	  		
	  		if(giocata.equals("carta") || giocata.equals("sasso") || giocata.equals("forbici")) {
	  			//Controllo il gioco
	  			
	  			if(esito(giocata) == 0) {
	  				System.out.println("Hai pareggiato");
	  				pareggi++;
	  			}else if(esito(giocata) == 1) {
	  				System.out.println("hai vinto");
	  				vittorie++;
	  			}else {
	  				System.out.println("Hai perso");
	  				sconfitte++;
	  			}
	  			
	  		}else if(giocata.equalsIgnoreCase("fine")) {
	  			
	  			System.out.println("Gioco concluso, ecco i risultati: ");
	  			System.out.println("Hai giocato " + (vittorie+ pareggi+sconfitte) + " volte");
	  			System.out.println("Hai vinto " + vittorie + " volte");
	  			System.out.println("Hai perso " + sconfitte + " volte");
	  			System.out.println("Hai pareggiato " + pareggi + " volte");
	  			
	  		}else {
	  			
	  			System.out.println("Giocata non valida");
	  		}
	  		
		}while(!giocata.equals("fine"));
		
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
		 * 0 - pareggiato
		 */
		
		Random rm = new Random();
		
		String computer_giocata;
		
		String[] simboli = {"carta", "sasso","forbici"};
		
		computer_giocata = simboli[rm.nextInt(3)];
		//System.out.println(computer_giocata);
		
		//Vado a testare chi vince
		if(player_giocata.equals(computer_giocata)) { //Caso di pareggio
			return 0;
		}else if((player_giocata.equals("forbici") && computer_giocata.equals("carta")) || 
				(player_giocata.equals("sasso") && computer_giocata.equals("forbici")) ||
				(player_giocata.equals("carta") && computer_giocata.equals("sasso"))
				) { //Vince il player
			return 1;
		}else {//Vince il computer
			return 2;
		}
		
		
	}

}
