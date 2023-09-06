package Base;

import java.util.Scanner;

public class Lezione_05_AND_OR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		/*
		 * Intrduzione agli operatori AND e OR
		 * 
		 * Operatore AND (e) si scrive &&, si usa quando tutte le condizioni devono essere verificate
		 * 
		 * Operatore OR (o) si scrive ||, si usa quando almeno una delle condizioni è vera
		 * 
		 * Operatore XOR (o esclusivo) ^, si usa quando vogliamo che solo una condizione sia verificata
		 * 
		 */
		
		//Esercizio tipo
		
		//Piccola introduzione alle stringhe.
		
//		System.out.println("Inserisci il tuo nome");
//		String nome = in.nextLine();
//		
//		//nome == "Aldo" va sostituito con equals che è un metodo delle stringhe
//		if(nome.equals("Aldo")) {
//			System.out.println("Ciao Aldo");
//		}else {
//			System.out.println("Non ti conosco");
//		}
		
		/*
		 * Esempio:
		 * 
		 * Creare un software per vedere se puoi richiedere la patente. Puoi chiedere la patente solo se 
		 * hai più di 18 anni e sai residente in Italia
		 * 
		 * es:
		 * Quanti anni hai? 19
		 * Dove vivi? Italia
		 * 
		 */
		
		//Dichiaro le variabili che userò nell'esercizio
		int eta;
		String residenza;
		
		System.out.println("Quanti anni hai?");
		eta = in.nextInt();
		
		System.out.println("Dove vivi?");
		residenza = in.next();
		
		if(eta >= 18 && residenza.equals("Italia")) {
			System.out.println("Puoi seguire il corso per la patente");
		}else {
			System.out.println("Non puoi guidare");
		}

	}

}
