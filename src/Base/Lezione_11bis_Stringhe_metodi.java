package Base;

import java.util.Scanner;
import java.util.Arrays;

public class Lezione_11bis_Stringhe_metodi {

	public static void main(String[] args) {
		// Link ai metodi: https://www.w3schools.com/java/java_ref_string.asp
		Scanner in = new Scanner(System.in);
		
		String str = "     prova stringa     ";
		
		//charAt() restituisce un carattere specificando l'indice
		System.out.println(str.charAt(0));
		
		//length() restituisce il numero di caratteri della stringa, spazzi inclusi
		System.out.println(str.length());
		
		//Per eliminare eventuali spazzi vuoti prima e dopo la fine della stringa si usa il metodo trim()
		System.out.println("Prima del trim: " + str + " dopo la str");
		System.out.println("Dopo il trim: " + str.trim() + " dopo la str");
		
		//Risolvere il problema del casesensitive
		String str1 = " NICola";
		String str2 = "nicOLA";
		
		String str2_b = str2.toLowerCase();
		
		//equals() serve a confrontare il contenuto di una stringa con il contenuto di un'altra stringa
		//toLowerCase() serve a trasformare il contenuto della stringa in minuscolo
		//toUpperCase()serve a trasformare il contenuto della stringa in MAIUSCOLO
		
		System.out.println(str1.toLowerCase());
		System.out.println(str2.toUpperCase());
		
		if(str1.trim().toLowerCase().equals(str2.trim().toLowerCase())) {
			System.out.println("Le stringhe coincidono");
		}else {
			System.out.println("Le stringhe non coincidono");
		}
		
		//Altro metodo per caseinsensitive equalsIgnoreCase()
		if(str1.trim().equalsIgnoreCase(str2.trim())) {
			System.out.println("Le stringhe coincidono");
		}else {
			System.out.println("Le stringhe non coincidono");
		}
		
		//Es: data la stringa "     Ciao Mondo    ", stampare il numeri di caratteri escludengo gli spazzi
		//prima e dopo la stringa
		String str_es1 = "      Ciao Mondo    ";
		System.out.println(str_es1.trim().length());
		
		
		//Modificare parole dentro una stringa
		
		String str3 = "Corso di JAVA per classi JAVA";
		
		//replace() o replaceAll() Sostituiscono tutte le occorrenze
		System.out.println(str3.replace("JAVA", "PHP")); //Parola da sostituire, come sostituire
		
		//replaceFirst() sostituisce solo la prima occorrenza
		System.out.println(str3.replaceFirst("JAVA", "PHP"));
		str3 = str3.replace("JAVA", " PHP"); //Modifico definitivamente la str3
		System.out.println(str3);
		
		String str3_b = "Ciao  Mondo, come  state";
		str3_b = str3_b.replace("  ", " "); //Elimino i doppi spazzi nella stringa
		str3_b = str3_b.replace(",", ""); //Elimino le vigole nella stringa
		str3_b = str3_b.trim();
		str3_b = str3_b.toLowerCase();
		System.out.println(str3_b);
		
		//Come creare una nuova stringa partendo da una stringa esistente
		
		String str4 = "Benvenuti nel corso di JAVA. Il corso è organizzato da RANDSTAD";
		
		//Creo una sottostringa di str4, fino a JAVA.
		
		System.out.println(str4.substring(15)); //Se inserisco solo un intero sarà dall'inidce indicati fino alla fine
		System.out.println(str4.substring(15, 25)); //Se inserisco interi sarà dall'inidce indicato fino al secondo indice indicato escluso
		
		//Per conoscere l'indice di partenda di una parola o carattere dentro una stringa si unsa indexOf()
		
		System.out.println(str4.indexOf("nel"));
		
		//ES 2:
		//Stampare fino a JAVA. partendo salla str4
		System.out.println(str4.indexOf("JAVA")); //Trovo l'indice di inzio della parola JAVA
		System.out.println(str4.substring(0, str4.indexOf("JAVA") + 5));
		
		
		//Traformare una stringa in un array
		String nomi = "Michele Mario Giuseppe";
		
		String[] nome_ar = nomi.split(" ");
		System.out.println(Arrays.toString(nome_ar)); //tostring serve a stampare il contenuto dell'array senza ciclo
		
		String numeri = "1,2,4,34,5";
		
		String[] ar_num = numeri.split(",");
		
		System.out.println(Arrays.toString(ar_num));
		
		//Verificare se in una stringa è contenuto un elemento
		String str5 = "Alunno alessio leodori";
		System.out.println(str5.contains("alessio"));

	}

}
