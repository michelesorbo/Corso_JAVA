package Base;

import java.util.Scanner;

public class Lezione_11_Stringhe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String nome = "Michele Sorbo";
		int numero = 3;
		
		/*
		 * Una stringa altro non è che un array di caratteri
		 */
		
		//Voglio stamapre solo la prima lettera della Stringa nome
		System.out.println(nome.charAt(0)); //ar[0]
		
		//Sapere la lunghezza di una stringa
		System.out.println("La lunghezza della stringa nome è: " + nome.length());
		
		//Voglio stampare l'ultimo carattere di una stringa
		System.out.println("L'ultimo carattere della stringa nome è: " + nome.charAt(nome.length()-1));
		
		//Confronto di caratteri
				char a = 'd', b = 'c';
				
				if(a == b) {
					System.out.println("Uguali");
				}else {
					System.out.println("Diversi");
				}
		
		//ES:
		//Data una stringa contenente "Ciao Mondo" restituire il numero di voacli
		
		
		
		String parola = "ciao mondo";
		
		int num_vocali = 0;
		
		//1° metodo if con tanti or per ogni vocale
		for(int c = 0; c < parola.length(); c++) { //Prendo il singolo carattere della frase
			System.out.println(parola.charAt(c));
			if(parola.charAt(c) == 'a' || parola.charAt(c) == 'e' || parola.charAt(c) == 'i' || parola.charAt(c) == 'o' || parola.charAt(c) == 'u') {
				num_vocali++;
			}
		} //Fine For
		
		System.out.println("Il numeo delle vocali con il 1° metodo è: " + num_vocali);
		
		
		//2° creo un array di caratteri con le vocali e per ogni lettera ciclo l'arry
		num_vocali = 0; //Riporto a 0 il contatore
		char[] vocali = {'a','e','i','o','u'}; //Creo l'arry delle vocali
		
		for(int c = 0; c < parola.length(); c++) {
			for(char v:vocali) {
				if(v == parola.charAt(c)) {
					num_vocali++;
				}//FIne IF
			}//Fine 2° FOR
		}//Fine 1° For
		
		System.out.println("Il numeo delle vocali con il 2° metodo è: " + num_vocali);
		
		//Prendere una stringa e scriverla al contrario
		
		//Dopo averla scritta al contrario vedere se è palindroma es: osso, anna
		
		String test = "Ciao";
		test += " Mondo";
		
		System.out.println(test);
		
		//Scrivere una parola al contrario
		String parola2 = "osso";
		String parola_revers = ""; //creo una stringa vuota;
		
		for(int c = parola2.length()-1; c >= 0; c--) {
			System.out.print(parola2.charAt(c));
			//Se la volevo ricordare in una nuova stringa
			parola_revers += parola2.charAt(c);
		}
		
		System.out.println("La parola scritta al contrario è: " + parola_revers);
		
		if(parola2.equals(parola_revers)) {
			System.out.println("Parola palindroma");
		}else {
			System.out.println("Parola non palindorma");
		}
		

	}

}
