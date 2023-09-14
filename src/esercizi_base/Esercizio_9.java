package esercizi_base;

import java.io.*;
import java.util.Scanner;

public class Esercizio_9 {

	public static void main(String[] args) {
		/*
		 * 
		 * 	Chiedere all'untente di iserire una frase e memorizzarla dentro il file frasi.txt che si trova 
			nella cartella File.
			
			Ogni frase deve essere scritta su una nuova riga.
			
			Quando parte il programma l'utente può sceglere di:
			1) inserire una frase
			2) Uscire dal programma.
			
			FARE UNA FUNZIONE scriviFrase() 
		 */
		
		File frasi = new File("File/frasi.txt");
		
		Scanner in = new Scanner(System.in);
		
		String frase;
		
		int scelta;
		
		do {
			System.out.println("Cosa vuoi fare?\n1) Scrivi una frase\n2) Chiudi il programma");
			scelta = in.nextInt();
			
			in.nextLine(); //Serve per resettare lo scanner
			
			if(scelta == 1) {
				//Chiedo la frase da inserire
				System.out.println("Scrivi la frase:");
				frase = in.nextLine(); //Salvo la frase nella variabile
				
				scriviFrase(frasi,frase); //Invoco la funzione con i parametri richiesti
				
			}else if(scelta == 2) {
				System.out.println("Chiudo il programma");
			}else {
				System.out.println("Scelta non consentita");
			}
			
		}while(scelta != 2);

	} //Fine Mail
	
	//Vuole il file dove scrivere e la frase da scrivere
	public static void scriviFrase(File file, String frase) {
		
		try {
			FileWriter fw = new FileWriter(file, true); //Scrivo il file in append per non perdere le cose che sono scritte nel file
			
			fw.append("\n" + frase);
			
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
