package Base;

import java.io.*;

public class Lezione_17b_Gestionefile {

	public static void main(String[] args) {
		
		//Provo ad aprire un file, se non esiste lo creo
		
		File file = new File("File/test.txt");
		
		try {
			if(file.exists()) {
				System.out.println("Il file esiste");
			}else if(file.createNewFile()) { //Provo a creare il file se non esiste
				System.out.println("Il file è stato creato nella posizione " + file.getPath());
			}else {
				System.out.println("non posso creare il file");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
