package Base;

import java.util.Scanner;

public class Lezione_09_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		/*
		 * Gli Array.
		 * 
		 * Gli array sono delle posizioni vicine di un determinato tipo
		 * 
		 * Quando creo un array oltra al tipo devo indicare la lunghezza
		 * 
		 * L'indice dell'array inizia sempre a 0
		 * 
		 * Per accedere ad un valore dell'arry lo faccio tramite l'indice
		 * 
		 */
		int var = 3;
		int i;
		int[] ar_numeri = new int[5]; //Ho creato un array da 5 POSIZIONI gli indici vanno da 0 a 4
		
		
	
		int[] ar_num2 = {3,6,78,9,45,32,23,4,32,12,4,5,65,76,8,9,90,21,87,65,45,34,22}; //Dichiaro e riempio un array
		
		//Memorizzo un elemento nell'array
		ar_numeri[0] = 4; //Ho inserito 4 nella posizione 0 dell'array
		ar_numeri[1] = 5;
		ar_numeri[2] = 7;
		ar_numeri[3] = 9;
		ar_numeri[4] = 12;
		
		//Come stampare tutti gli ementi dell'array
		for(i = 0; i < 5; i++) {
			System.out.println("Contenuto: " + ar_numeri[i]);
		}
		
		//Conoscere gli elementi di un array
		System.out.println("Gli elementi dell'array ar_num2 sono: " + ar_num2.length);
		
		//Stampare tutti gli elementi di ar_num2 usando length
		for(i = 0; i < ar_num2.length; i++ ) {
			System.out.println(ar_num2[i]);
		}
		
		//Per modificare il vare in una posizione dell'array basta indicare l'indice da modificare e sostituire il valore
		ar_numeri[3] = 27;
		
		for(i = 0; i < ar_numeri.length; i++) {
			System.out.println("Contenuto: " + ar_numeri[i]);
		}
		
		//Stampare ar_num2 al contrario
		for(i = ar_num2.length - 1; i >= 0; i--) {
			System.out.println(ar_num2[i]);
		}
		
		
		//Dato l'array ar_num2, dire quanti elementi sono pari e quanti sono dispari
		int ar_pari = 0, ar_dispari = 0;
		for(i = 0; i < ar_num2.length; i++) {
			if(ar_num2[i]%2 == 0) {
				ar_pari++;
			}else {
				ar_dispari++;
			}
		}
		
		System.out.println("Numeri pari: " + ar_pari + " Numeri dispari: " + ar_dispari);
		
		//Come leggere il contenuto di una rray con il forEach
		for(int el:ar_num2) {
			System.out.println(el);
		}
		
		String[] alunni = new String[3]; //Ho creato un array di stringhe di 5 elementi
		alunni[0] = "Nicola";
		alunni[1] = "Marco";
		alunni[2] = "Michele";
		
		for(String alunno:alunni) {
			System.out.println(alunno);
		}
		
		/*
		 * Creazione della classe.
		 * Chidere al'utente di quanti alunni è composta la classe.
		 * Creare un array e inserire gli alunni.
		 * 
		 * ES: 
		 * Quanti alunni vuoi inserire? -> 3
		 * Inserisci 1° alunno: Michele
		 * Inserisci 2° alunno: Antonio
		 * Inserisci 3° alunno: Mario
		 * 
		 * Gli alunni inserito sono: Michele Antonio Mario
		 */
		
		System.out.println("Quanti alunni vuoi inserire");
		int n_alunni = in.nextInt(); //Chiedo quanto deve essere capiente l'array
		
		//Dopo che ho chiesto la grandezza dell'arry posso crearlo vuoto
		String[] es_alunni = new String[n_alunni];
		
		//Chiedo di inserire i nomi, popolo l'array
		
		for(i = 0; i < es_alunni.length; i++) {
			System.out.println("Inserisci il "+ (i + 1) +"° alunno: ");
			es_alunni[i] = in.next(); 
		}
		
		//Dopo aver riempito l'array lo stampo a video
		for(String al : es_alunni) {
			System.out.print(al + ", ");
		}
		

	}

}
