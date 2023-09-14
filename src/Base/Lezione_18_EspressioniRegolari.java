package Base;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lezione_18_EspressioniRegolari {

	public static void main(String[] args) {
		
		/*
        1) Contiene stretto "agente 007" Pattern.CASE_INSENSITIVE rende il pattern indifferente dalle maiuscole e minuscole
        2) per accettare solo numeri si usa \d (Solo digit)
        3) {3} indicano quante volte deve essere ripetuta la regola
        4) {3,6} indicano il range
        5) ^ la stringa deve iniziare sencondo la regola
        6) [aA] serve a definere il range dei caratteri accettati [a-z] oppure [A-Z] [0-9]
        7) (a|A|aa) serve a definire regole strette
        8) $ sta per fine stringa
         */
		
		// Creare la regola per il codice fiscale AAABBB11C22B333C ^[A-Z]{6}[0-9]{2}[A-Z]{1}[0-9]{2}[A-Z]{1}[0-9]{3}[A-Z]{1}$
        // ^[0-9]{5} Verifico CAP
        // ^(.+)@(.+)\.[a-z]{2,5}$ verifica della mail
        // +11 222-2345678 ^\\+[0-9]{2} [0-9]{3}-[0-9]{7}$
		
		//Regola per il cap, deve iniziare con un numero deve contenere 5 numei e poi basta
		Pattern cap = Pattern.compile("^[0-9]{5}$"); //Vado a scrivere la regola. 12345
		Matcher cap_m = cap.matcher("81020"); //Vado a testare la regola sulla stringa
		
		System.out.println(cap_m.find()); //Ritorna true se la regola coincede false se è sbagliata
		
		Pattern mia_reg = Pattern.compile("^[ABC]"); //La stringa seve iniziare o con a o con b o con c maiuscole
		Matcher mia_reg_m = mia_reg.matcher("Alessio");
		
		System.out.println(mia_reg_m.find());
		
		Pattern cf = Pattern.compile("^[A-Z]{6}[0-9]{2}[A-Z]{1}[0-9]{2}[A-Z]{1}[0-9]{3}[A-Z]{1}$");
		Matcher cf_m = cf.matcher("SRBMHL79L26B715S");
		
		System.out.println(cf_m.find());
		
		Pattern mail = Pattern.compile("^(.+)@(.+)\\.[a-z]{2,5}$");//Vado a scrivere le regole di RegEx
        Matcher mail_m = mail.matcher("test@test.cloud");
        
        System.out.println(mail_m.find());
	}

}
