package Base;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Lezione_15_GestioneDate {

	public static void main(String[] args) {
		
		//Data Corrente
		LocalDate data = LocalDate.now(); //Ritorna una data in formato Americano Anno/Mese/Giorno
		System.out.println(data); 
		
		//Posso anche comparare 2 date
		LocalDate data2 = LocalDate.of(2023, 9, 13);
		System.out.println(data.compareTo(data2)); //Serve a confrontare le date
		//1 se la data è inferiore alla data confrontata
		//-1 se è superiore
		//0 se è ugulae
		
		//Ottenre l'ora corrente
		LocalTime ora = LocalTime.now(); //Ora : minuti : secondi . millisecondi
		System.out.println(ora);
		
		//Data e ora corrente
		System.out.println(data + " " + ora);
		
		//Come cambiare la formattazione di una data
		DateTimeFormatter itDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Data in formato Italiano: " + data.format(itDateFormat));
		
		//Formattare con mese in formato testo
		DateTimeFormatter itDateMese = DateTimeFormatter.ofPattern("dd MMMM yyyy");
		System.out.println("Data con mese esteso: " + data.format(itDateMese));
		
		DateTimeFormatter itMeseGiorno = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy");
		System.out.println("Data con giorno e mese estesi: " + data.format(itMeseGiorno));
		
		DateTimeFormatter itOraMinuti = DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println("Ora e minuti: " + ora.format(itOraMinuti));
		
		//Avere una data Completa di Gioni, mese, anno, ore, minuti, secodni e millisecondi
		LocalDateTime data_completa = LocalDateTime.now();
		System.out.println("Data completa senza formattazione: " + data_completa);
		
		DateTimeFormatter itDataCompleta = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy HH:mm");
		System.out.println("Data con tutto formattato: " + data_completa.format(itDataCompleta));
		
		//Scrivere una funzione che chieda giorno, mese e anno e farà la comparazione con la data attuale
		//Se la data è ugule dirà data attuale
		//Se la data inserita è inferiore dirà data nel passato
		//Se la data è superiore dirà data nel futuro
		//Controllare che il giorno sia compreso tra 1 e 31 in caso di errore mettere come valore di default 1
		//Controllare se il mese è compreso tra 1 e 12 in caso di errore mettere come valore di default 1
		
		confrontoDate(); //Faccio eseguire la funzione
	} //Fine Main
	
	public static void confrontoDate() {
		Scanner in = new Scanner(System.in);
		int anno,mese,giorno;
		
		System.out.println("CONFRONTIAMO LE DATE\nse metti date errate inserirò 1 sia come mese che come giorno");
		
		System.out.println("Inserisic il giorno");
		giorno = in.nextInt();
		System.out.println("Inserisci mese");
		mese = in.nextInt();
		System.out.println("Inserisci anno");
		anno = in.nextInt();
		
		//Controlle se giorno e mese sono corretti altrimenti inserisco 1
		giorno = giorno > 0 && giorno < 32 ? giorno : 1;
		mese = mese > 1 && mese < 13 ? mese : 1;
		anno = anno > 0 ? anno : 1;
		
		//Creo la data odierna
		LocalDate data_odierna = LocalDate.now();
		
		//Creo la data che mi è stata passata
		LocalDate data_inserita = LocalDate.of(anno, mese, giorno);
		
		if(data_odierna.compareTo(data_inserita) == 0) {
			System.out.println("La data inserita è uguale alla data odierna");
		}else if(data_odierna.compareTo(data_inserita) > 0) {
			System.out.println("La data inserita è una data nel passato");
		}else {
			System.out.println("La data inserita è una data nel futuro");
		}
		
	}
	
	

}
