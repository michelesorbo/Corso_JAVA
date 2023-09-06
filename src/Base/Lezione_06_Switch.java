package Base;

import java.util.Scanner;

public class Lezione_06_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		/*
		 * Il costrutto switch case serve a gestire le scelte.
		 * 
		 * Si può sostituire con un if else if
		 * 
		 * Obsoleto
		 * 
		 */
		
		/*
		 * Costruire un menu e stapare a video la scelta
		 * 
		 */

		System.out.println("Scegli un operazione, digita: \n1 - somma \n2 - sottrazione \n3 - moltiplicazione \n4 - divisione");
		
		int scelta = in.nextInt();
		
		switch(scelta) {
		case 1:
			System.out.println("Hai scelto somma");
			//Continuo con il codice
			break;
		case 2:
			System.out.println("Hai scelto sottrazione");
			//Contuanre ocn il codice
			break;
		case 3:
			System.out.println("Hai scelto molti");
			break;
		case 4:
			System.out.println("Hai scelto divisione");
			System.out.println("Non inserire 0 mi raccomando");
			break;
		default:
			System.out.println("Scelta non valida");
			//Altro codice se serve
			break;
		}
		
		//Cambia quando vado a valuta le stringhe
		
		System.out.println("Inserisci il tuo nome");
		
		String nome = in.next();
		
		switch(nome) {
		case "Alessio":
			System.out.println("Ciao Alessio");
			break;
		case "Emidio":
			System.out.println("Ciao Emidio");
			break;
		default:
			System.out.println("non ti conosco");
			break;
		}
		
	}

}
