package esercizi_base;

import java.util.Scanner;
import java.util.ArrayList;

public class Esercizio_1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		ArrayList<String> persone = new ArrayList();
		int scelta;
		String nome;

		
		do {
			System.out.println("Scegli\n1) Aggiungi persona \n2) Elimina persona\n3) Stampa elenco persone\n4) Ordina le persone\n5) Esci");
			scelta = in.nextInt();
			
			if(scelta == 1) {
				
				System.out.println("Inserisci il nome della persona da aggiungere: ");
				nome = in.next();
				persone.add(nome.toLowerCase());
				System.out.println("Nome aggiunto con successo");
				
			}else if(scelta == 2) {
				
				System.out.println("Inserisci il nome della persona da elimenare: ");
				nome = in.next();
				persone.remove(persone.indexOf(nome.toLowerCase()));
				System.out.println("Persona eliminata con successo");
				
			}else if(scelta == 3) {
				System.out.println("*** Elenco delle persone ****");
				
//				for(int i = 0; i < persone.size(); i++) {
//					System.out.println(persone.get(i).substring(0,1).toUpperCase() + persone.get(i).substring(1));
//				}
				
				for(String p: persone) {
					System.out.println(p.substring(0,1).toUpperCase() + p.substring(1));
				}
				
				System.out.println("*** FINE Elenco ****");
				
			}else if(scelta == 4){
				persone.sort(null);
				System.out.println("Lista Ordinata");
			}else if(scelta == 5) {
				System.out.println("Fine Programma");
			}else {
				System.out.println("Sclta non valida");
			}
			
		}while(scelta != 5);
		
	}

}
