package Base;

public class Lezione_02_Operatori {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		/*
         * Le operazioni in JAVA sono:
         * 
         * + Somma es 2 + 2 = 4
         * 
         * - Sottrazione es 2 - 2 = 0
         * 
         * / divisione es 2 / 2 = 1
         * 
         * * moltiplicazione 2 * 2 = 4
         * 
         * % modulo (Il resto della divisione) 2%2 = 0 - 3%2 = 1
         */
		
		int n1, n2, somma;
		String n3 = "2";
		
		n1 = 3;
		n2 = 2;
		
		//Esempio Somma
		System.out.println(n1 + n2); //+ diventa somma perchè sono due interi
		System.out.println(n1 + n3); //+ diventa concatenazione tra intero e stringa
		
		somma = n1 + n2; //Ricordo il valore della somam dei due interi
		System.out.println(somma);
		
		//Shorthand
		n1 += n2; //n1 = n1 + n2; il valore di n1 verrà cambiato dopo l'operazione
		System.out.println("il nuovo valore di n1 è: " + n1);
		
		//Esempio Sottrazione
		n1 = 3;
		n2 = 4;
		System.out.println(n1 - n2);
		
		//Esempio moltiplicazione
		n1 = 4;
		n2 =12;
		System.out.println(n1 * n2);
		
		//Divisione NON POSSO DIVIDERE PER 0
		double nd1 = 12, nd2 = 5;
		n1 = 12;
		n2 = 2;
		
//		double divisione;
//		
//		divisione = n1/n2;
//		
//		System.out.println(divisione);
		System.out.println(nd1/nd2);
		
		//Esempio Modulo o resto della divisione
		n1 = 7;
		n2 = 3;
		System.out.println(4%2);
		System.out.println(n1%n2);
		
		
		//Operatori di COMPARAZIONE
		/*
		 * > Maggiore
		 * 
		 * >= Maggiore Uguale
		 * 
		 * < Minore
		 * 
		 * <= Minore Uguale
		 * 
		 * == Uguale
		 * 
		 *!= Diverso
		 *
		 *Questi operatori ritornano sempre un valore boolenao, true se la comparazione è vera o false se la comparazione è falsa
		 * 
		 */
		
		//Operatore Maggiore
		n1 = 3;
		n2 = 3;
		System.out.println(n1 > n2);

		//Operatore Maggiore Uguale
		System.out.println(n1 >= n2);
		
		//Operatore Minore 
		System.out.println(n1 < n2);
		
		//Operatore Minore Uguale 
		System.out.println(n1 <= n2);
		
		//Operatore Uguaglianza
		n1 = 5;
		n2 = 6;
		System.out.println(n1 == n2);
		
		//Operatore Diverso
		System.out.println(n1 != n2);
		
		
		//Operatori di incremento e decremento
		/*
		 * ++ Incremnto di 1
		 * 
		 * -- Decremento di 1
		 * 
		 * Questi operatori cambiano il valore della variabile
		 * 
		 */
		
		int i = 1;
		
		i++; //Incremento la i
		System.out.println("Il valore della i dopo l'incremento è: " + i);
		
		i = 3;
		System.out.println("Il valore di i++ è: " + ++i);
		
		int y = 3;
		y--;
		System.out.println("Il valore di y è: " + y);
		
		y = 5;
		System.out.println("Il valore di --y è: " + --y);
		
		/*
		 * Per stamapre l'incremento o il decremento ricordati di fare --/++ e la variabile da prendere come riferimento
		 */
		
		//Operatore Ternario
		/*
		 * Serve a inizializzare una variabile in base al contenuto di un'altra variabile
		 * 
		 * variabile = condizione ? caso vera : caso falsa
		 */
		
		int imp_utente = 8;
		
		//Voglio settare il mese, se l'imp_utente è compreso tra 1 e 12 inserisco il valore dell'utente altrimenti inserisco 1
		
		int mese = imp_utente > 0 && imp_utente < 13 ? imp_utente : 1;
		
//		if(imp_utente > 0 && imp_utente < 13) {
//			mese = imp_utente;
//		}else {
//			mese = 1;
//		}
		
		System.out.println("Il mese è: " + mese);
		
		
		String nome = "Alessio";
		String cognome = nome == "Michele" ? "Sorbo" : "NEssun Cognome";
		System.out.println(cognome);
		
		
		
	}

}
