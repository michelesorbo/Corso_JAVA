package Base;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lezione_17_GestioneFile {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		File file = new File("File/prova.txt"); //Apro il file che si trova nella cartella File e associo il file prova.txt all'oggetto file
		//L'apertura di un file non genera un errore bloccante
		
		//Verifico che il file esiste
		if(file.exists()) {
			System.out.println("Il file è stato trovato");
			System.out.println("Il Path Relativo del file è: " + file.getPath());
			System.out.println("Il Path Assoluto del file è: " + file.getAbsolutePath());
			System.out.println("è un file? " + file.isFile());
		}else {
			System.out.println("File non trovato");
		}
		
		//Scrivere dentro un file
		
		try {
			//FileWriter serve a scrivere in un file.
			//FileWriter writer = new FileWriter(file); //Apro il file e concello il contenuto al suo interno
			FileWriter writer = new FileWriter(file, true); //Vado ad aprire il file e posiziono il cursore alla fine del file
			
			//writer.write("Scrivo cose nuove"); //Scrivo nel file cancellando il contenuto
			writer.append("\nSono un nuovo testo"); //Appende serve a scrivere nel file senza cancellare
			
			writer.close();//Devo sempre chiudere il writer
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		

	}

}
