package esercizi_base;

public class Esercizio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String es = "ciao";
		
		if(isPalindroma(es)) {
			System.out.println("Palindroma");
		}else {
			System.out.println("Non Palindroma");
		}

	}
	
	public static boolean isPalindroma(String parola) {
		//Devo invertire la parola
		String parolaInvertita = ""; //Serve per memorizzare la parola invertita
		
		//Faccio un for per leggere la parola al contratio. Ricordati che la String aè come un array
		for(int i = parola.length() - 1; i >= 0; i--) {
			parolaInvertita += parola.charAt(i); //Concateno le singole lettere della parola prese al contratio
		}
		
//		if(parola.equals(parolaInvertita)) {
//			return true;
//		}else {
//			return false;
//		}
		
		//Dato che il metodo equals ritorna true o false
		return parola.equals(parolaInvertita);
	}

}
