package esercizi_base;

import java.util.Scanner;
import java.util.ArrayList;

public class Esercizio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ArrayList<String> todo = new ArrayList<String>();
		
		int scelta, todo_el;
		String str;
		
		do {
			//STampo subuto l'eventuale lista delle cose da fare
			if(todo.size() > 0) {
				System.out.println("*** Cose da fare ***");
				for(int i = 0; i < todo.size(); i++) {
					
					System.out.println((i+1) + ") " + todo.get(i));
				}
				System.out.println("*** Fine Lista ***");
				
			}else {
				System.out.println("*** NON HAI NULLA DA FARE ***");
			}
			
			//Stampo il menu
			System.out.println("Scegli:\n1) Aggiungi ToDo \n2) Elimina ToDo \n3) Esci dal programma");
			scelta = in.nextInt();
			
			if(scelta == 1) {
				System.out.println("Aggiungi un nuovo ToDo: ");
				todo.add(in.next());
				System.out.println("*** Elemento Inserito ***");
				
			}if(scelta == 2) {
				System.out.println("Inserisci il numero della voce da eliminare");
				todo_el = in.nextInt();
				todo.remove(todo_el - 1);
				System.out.println("*** Elemento Eliminato");
			}else if(scelta == 3) {
				System.out.println("Chiudo il programma");
			}else {
				System.out.println("Scelta non valida");
			}
			
		}while(scelta != 3);
	}

}
