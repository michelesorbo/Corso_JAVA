package Base;

public class Lezione_03_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Link documentazione: https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
		
		//Calcolo la radice quadrata di un numero
		System.out.println(Math.sqrt(9));
		
		//Conoscere il massimo tra 2 numeri
		System.out.println(Math.max(3, 9));
		
		int n1 = 8, n2 = 12;
		System.out.println(Math.max(n1, n2));
		
		//Conoscere il minimo tra 2 numeri
		System.out.println(Math.min(n1, n2));
		
		int n3 = -4;
		//Valore assoluto di un numero
		System.out.println(Math.abs(n3));
		
		
		//Generare un numero Randomico
		System.out.println(Math.random() * 10);
		//Se voglio il risultato come intero e non double devo fare un cast
		int numRandom = (int)(Math.random() * 10); //Ho i numeri da 0 a 9 (int) serve a traformare il risultato che è un double in intero
		System.out.println(numRandom);
		
		int numRandom2 = (int)(Math.random() * 10) + 1; //Da 1 a 10
		System.out.println(numRandom2);
		
		
		//Esercizio
		/*
		 * Chiedere di inserire un numero da tastiera e restituire la radice quadrata
		 * 
		 * es: 
		 * Inserisci un numero: 9
		 * La radice quadrata del numero è: 3 
		 */
		
		//Esercizio 2
		/*
		 * Chiedere altri 2 numeri e restituire il numero con il valore massimo
		 * 
		 * Inserisci il primo numero: 7
		 * Inserisci il secondo numero: 9
		 * Il numero maggiore inserito è: 9
		 */

	}

}
