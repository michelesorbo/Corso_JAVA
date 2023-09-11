package Base;

import java.util.Scanner;

public class Lezione_08_WHILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		/*
		 * WHILE
		 * 
		 * ripete un codice finchè non si verifica la condizione di uscita
		 * 
		 * il while vuole solo la condizione di uscita while(condizione di uscita)
		 * 
		 * 
		 * "tutti i FOR possono divnetare WHILE ma non tutti i WHILE possono diventare FOR"
		 */
		
		//FOR per stamapre 10 numeri
		//for(inidice inizio; condizione di uscita; incremento)
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("Rifatto con il while");
		
		int i = 1; //Dichiaro l'inizio dell'indice
		
		while(i <= 10) { //Condizione di uscita
			i++;
			System.out.println(i);
			//i++; //incremento
		}
		
		/*
		 * Caso di uso del while
		 * 
		 * Fare la somma dei numeri inseriti da tastiera fermarsi quando l'utente inserisce 0
		 * 
		 */
		//Mod ricordare quanti numeri sono stati inseriti
		
		int num_inp;
		int somma = 0;
		int tot_num = 0;
		
		System.out.println("Sommo i numeri inserisci 0 per terminare.");
		num_inp = in.nextInt(); //Posso inserire tutti i numeri anche 0
		
		while(num_inp != 0) { //Finchè il numero che hai inserito è diverso da 0 eseguo il while
			tot_num++; //Incremento il numero di numeri inseriti diversi da 0
			somma += num_inp; //Aggiorno la somma
			
			//Incremento dell'indice devo chiedere un nuovo numero e verificare che non sia 0
			System.out.println("Inserisci un nuovo numero, 0 per teminare");
			num_inp = in.nextInt(); //Ricevo un nnuvo numero da tastiera e lo faccio testare nella condizione del while
			
		}
		
		System.out.println("La somma dei numeri inseriti è: " + somma + " e hai inserito " + tot_num + " numeri");
		System.out.println("La media è: " + (somma/tot_num)); //Soluzione esercizio sotto
		
		//Fare un programma che prenda in input vari numeri finchè non si inserisce 0
        //Stampare la somma e la media (vedi sopra)
		
		
		/*
		 * DO WHILE
		 * 
		 * si usa quando devo fare un operazione almeno la prima volta
		 * 
		 * while: prima controlla la condizione di uscita e poi esegue il codice
		 * 
		 * do while: prime esegue e poi controlla la condizione di uscita
		 * 
		 * quello che si sicrive nel do{} verrà eseguito almeno una volta
		 * 
		 * es: devo inizializzare la variabile per effettuare la ndizione di uscita
		 * 
		 */
		
		somma = 0; //Resetto la somma
	
		System.out.println("DO WHILE INIZIO");
		//Rifare chiedere la somma dei numeri 0 per uscire
		
		do {
			System.out.println("Inserisci un numero 0 per teminare");
			num_inp = in.nextInt();
			
			somma += num_inp;
			
		}while(num_inp != 0);
		
		//Testa o croce
		/*
		 * Chiedere all'utente di inserire 1 per testa 2 per croce
		 * 
		 * Se l'utente indovina scrivere hai indovinato altrimenti richiedere di inserire 1 per testa 2 per corce
		 * 
		 */
		
		//Dichiaro la variabili che servono
		int scelta, lancio;
		
		do {
			System.out.println("Inserisci 1 per testa 2 per croce");
			
			scelta = in.nextInt(); //Ricordo la scelta dell'utente
			
			//Simulo il lancio della moneta
			lancio = (int)(Math.random() * 2) + 1; //Faccio generare un numero casuale tra 1 e 2
			
			System.out.println("Scelta utente: " + scelta);
			System.out.println("Lancio random: " + lancio);
			
			if(scelta == lancio) {
				System.out.println("Hai vinto");
			}else {
				System.out.println("Hai perso riprova");
			}
			
		}while(scelta != lancio);
		
		System.out.println((int)(Math.random() * 2) + 1);

	}

}
