package esercizi_base;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Esercizio_10_RubricaClienti {
	
	/*
    Creare un programma che crei una lista di clienti di un negozio.
    
    Il programma deve chiedere se inserire un nuovo cliente nel file o se si
    vuole leggere la lista dei clienti presenti nel file.
    
    Nome del file Clienti.txt
    
    Quando si inserisce un cliente chiedere Nome Cognome e Codice Fiscale. Prima di inserire il cliente
    controllare se è già presente nel file tramite il codice fiscale.
    
    Salvare i dati in minuscolo
    
    Fare la funzione di ricerca per clienti
     */
	
	static Scanner in = new Scanner(System.in); //Rendo la variabile Scanner visibile a tutti i metodi

	public static void main(String[] args) throws IOException {
		
		
		int scelta;
		boolean esito_file = true;
		
		File file = new File("File/clienti.txt");
		
		//Controlle se il file esiste, se non esiste lo creo
		
		try {
			if(file.exists()) {
				System.out.println("File Caricato...");
			}else if(file.createNewFile()) {
				System.out.println("File creato e pronto all'uso...");
			}else {
				System.out.println("File non trovato, errore nel programma");
				esito_file = false;
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//Vado a creare il menu
		if(esito_file) {
			
			do {
				System.out.println("1) Inserisci Cliente \n2) Visualizza clienti \n3) Cerca Cliente\n0) Chiudi programma");
				scelta = in.nextInt();
				in.nextLine(); //Per evitare il BUG di Scanner
				
				if(scelta == 1) {
					//Inserisci cliente
					inserisciCliente(file);
					
				}else if(scelta == 2) {
					//Visualizza Clienti
					visualizzaClienti(file);
					
				}else if(scelta == 3) {
					//cerca Cliente
					cercaClienti(file);
					
				}else if(scelta == 0) {
					System.out.println("Chiudo il programma");
				}else {
					System.out.println("Scelta non valida");
				}
			}while(scelta != 0);
			
			
		}else {
			System.out.println("Errore imprevisto, contatta l'amministratore");
		}
		

	} //FIne Main
	
	public static String pulisciTesto(String testo) {
		testo = testo.trim();
		testo = testo.toLowerCase();
		testo = testo.replace(",","");
		testo = testo.replace(".","");
		testo = testo.replace("  "," ");
		return testo;
	}
	
	public static void inserisciCliente(File file) throws IOException {
		
		String nome, cognome, cf;
		
		System.out.println("Inserisci il nome:");
		nome = in.nextLine();
		System.out.println("Inserisci il cognome:");
		cognome = in.nextLine();
		System.out.println("Inserisci il Codice Fiscale:");
		cf = in.nextLine();
		
		//Controllo se il cf è scritto bene
		Pattern cf_c = Pattern.compile("^[a-z]{6}[0-9]{2}[a-a]{1}[0-9]{2}[a-a]{1}[0-9]{3}[a-a]{1}$");
		Matcher cf_m = cf_c.matcher(pulisciTesto(cf));
		
		System.out.println(cf_m.find());
		
		if(!cercaClienti(file, pulisciTesto(cf)) && cf_m.find()) {
			FileWriter fw = new FileWriter(file, true); //Apro il file in append
			fw.append(pulisciTesto(nome) + " " + pulisciTesto(cognome) + " " + pulisciTesto(cf) + "\n");
			fw.close();
			System.out.println("Utente inserito correttamente");
		}else {
			System.out.println("Utente già presente");
		}
		
		
	}
	
	public static boolean cercaClienti(File file, String testo) throws IOException {
		boolean trovato = false;
		
		FileReader fr = new FileReader(file);
		Scanner fs = new Scanner(fr);
		
		while(fs.hasNextLine()) {
			String data = fs.nextLine();
			if(data.contains(testo)){
				trovato = true;
			}
		}
		
		return trovato;
	}
	
	//Overload di cerca cliente
	public static void cercaClienti(File file) throws IOException {
		String cliente;
		int conta = 0;
		
		System.out.println("Inserisci nome cognome o codice fiscale del cliente da visulizzare");
		cliente = in.nextLine();
		
		FileReader fr = new FileReader(file);
		Scanner fs = new Scanner(fr);
		
		System.out.println("\n\n**** Utenti Trovati ****\n");
		
		while(fs.hasNextLine()) {
			String data = fs.nextLine();
			if(data.contains(pulisciTesto(cliente))){
				System.out.println(data);
				conta++; //Incremento solo se l'utente è stato trovato
			}
		}
		
		System.out.println("\n\nUtenti trovati " + conta + "\n****Fine Elenco****\n" );
		
		
	}
	
	public static void visualizzaClienti(File file) throws IOException {
		FileReader fr = new FileReader(file);
		Scanner fs = new Scanner(fr);
		int conta = 0;
		
		System.out.println("\n\n**** Inizio Elenco **** \n");
		
		while(fs.hasNextLine()) {
			String data = fs.nextLine();
			System.out.println(data);
			conta++;
		}
		
		System.out.println("\n\nSono presnti " + conta + " clienti");
		System.out.println("**** Fine Elenco **** \n");
		
	}

}
