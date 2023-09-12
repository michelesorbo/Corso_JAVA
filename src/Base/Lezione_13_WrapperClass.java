package Base;

import java.util.ArrayList;

public class Lezione_13_WrapperClass {

	public static void main(String[] args) {
		//Tipi primitivi
		int itero = 3;
		char carattere = 'c';
		double num_double = 15.36;
		boolean vero = true;
		float num_float = 15.85f;
		
		//tipi reference (referenziali). A differenza dei tipi primitivi hanno i metodi
		//i tipi reference hanno i imetodi, ma sono più difficili da gestire per il processore.
		//Vanno bene se ne usiamo pochi
		
		String frase = "Ciao mlndo";
		Integer intero_r = 4; //reference di int
		Integer intero_r2 = 4; //reference di int
		Character carattere_r = 'r';
		Double double_r = 15.36;
		Boolean falso = false;
		
		/*
		 * Il motivo per cui si usano i refernce è perchè gli ArrayList (che sono un evoluzione degli array)
		 * Accettano solo tipi referenziali
		 * 
		 * per utilizzarli bisogna richiamare la libreria java.util.ArrayList
		 */
		
		if(intero_r == intero_r2) {
			System.out.println("Sono uguali");
		}
		
		/*
		 * ArrayList
		 * 
		 * Sono degli array ma ridimensionabili
		 * Accettano solo reference
		 */
		
		//Creare un ArrayList di String
		ArrayList<String> persone = new ArrayList<String>();
		
		//Per inserire un elemento nell'arrayList si usa il metodo add() che inserisce un  elemento alla fine dell' ArrayList
		persone.add("Nicola");
		persone.add("Vincenzo");
		persone.add("Alessio");
		
		//Stampare tutto l'arrayList
		System.out.println(persone);
		
		//Conoscere la dimensione dell'ArrayList, o sapere il numero di elementi 
		System.out.println("Elementi in arrayList: " + persone.size());
		
		//Stampare un unico elemento dell'array list
		System.out.println(persone.get(1));
		
		//Stampare tutti gli elementi di un arrayList
		for(int i = 0; i < persone.size(); i++) {
			System.out.println(persone.get(i));
		}
		
		System.out.println("Stampa ArrayList con forEach");

		for(String el:persone) {
			System.out.println(el);
		}
		
		//Ordinare gli elementi di un ArrayList
		System.out.println("Array prima di essere ordinato: " + persone + " e il valoe all'indice 0 è: " + persone.get(0));
		persone.sort(null); //Da fare prima della stampa. Vengo cambiati gl'indici
		System.out.println("Array dopo l'ordinato: " + persone + " e il valoe all'indice 0 è: " + persone.get(0));
		
		//Come modificare un elemento di un ArrayList
		persone.set(0, "Zorro");
		System.out.println(persone);
		
		//Aggiungere un elemento in un determinato indice
		persone.add(2,"Emidio"); //L'indice deve essere sempre nell'range del size()
		System.out.println(persone);
		
		//Eliminare un elemento dall'ArrayList si usa remove(indice_dell'elemento_da_eliminare)
		persone.remove(2);
		System.out.println(persone);
		
		//Conoscere l'indice di un elemento
		System.out.println(persone.indexOf("Nicola"));
		
		//ES voglio eleminare Nicola senza sapere l'indice
		persone.remove(persone.indexOf("Nicola"));
		
		System.out.println(persone);
		
		//Vedere se un elemento è presente nell'ArrayList
		System.out.println(persone.contains("Vincenzo"));
		
		if(persone.contains("Vincenzo")) {
			System.out.println("Elemento presente");
		}else {
			System.out.println("Elemento non presente");
		}
		
		//Come copiare un array list
		ArrayList<String> persone_clone = (ArrayList<String>)persone.clone();
		System.out.println("Clonazione: " + persone_clone);
				
		//Cancellare tutti gli elementi dell'array list
		persone.clear();
		System.out.println(persone.size());
		
		/*
		 * ES1:
		 * 		
		 */
	}

}
