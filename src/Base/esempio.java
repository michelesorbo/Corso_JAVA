package Base;

import java.util.Scanner;

public class esempio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Creare un menu ciclico conn opzione di uscita
		 * 
		 * Scegli la tua opzione:
		 * 1) Ordina
		 * 2) Contatta il cameriere
		 * 3) Chiedi conto
		 * 4) Esci
		 * 
		 */
		Scanner in = new Scanner(System.in);
		int scelta;
		
		do {
			System.out.println("Scegli\n1) Ordina \n2) Contatta il cameriere\n3) Chiedi conto\n4) Esci");
			scelta = in.nextInt();
			
			if(scelta == 1) {
				System.out.println("Ordina...");
			}else if(scelta == 2) {
				System.out.println("Contatta il cameriere....");
			}else if(scelta == 3) {
				System.out.println("Chiedi conto...");
			}else if(scelta == 4){
				System.out.println("Grazie a presto...");
			}else {
				System.out.println("Sclta non valida");
			}
			
		}while(scelta != 4);

	}

}
