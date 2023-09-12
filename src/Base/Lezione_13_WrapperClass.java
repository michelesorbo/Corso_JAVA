package Base;

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
		 * accettano solo tipi referenziali
		 */
		
		if(intero_r == intero_r2) {
			System.out.println("Sono uguali");
		}
		
		

	}

}
