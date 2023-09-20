package Esercizio_10_DB;

import java.util.Scanner;
import java.sql.*;

public class GestioneStanze {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int scelta;
		String testo, query = "";
		
		do {
			System.out.println("Scegli 1) Cerca per Stanza \n2) Cerca per piano \n3) Cerca per Interno \n4) Cerca per nome\n0) Esci");
			scelta = in.nextInt();
			
			in.nextLine();
			
			if(scelta == 1) {
				System.out.println("Inserisci stanza");
				testo = in.nextLine();
				query = "SELECT * FROM uffici WHERE stanza = '"+ testo +"'";
				System.out.println(risQuery(query));
			}else if(scelta == 2) {
				System.out.println("Inserisci piano");
				testo = in.nextLine();
				query = "SELECT * FROM uffici WHERE piano = '"+ testo +"'";
				System.out.println(risQuery(query));
			}else if(scelta == 3) {
				System.out.println("Inserisci interno");
				testo = in.nextLine();
				query = "SELECT * FROM uffici WHERE interno = '"+ testo +"'";
				System.out.println(risQuery(query));
			}else if(scelta == 4) {
				System.out.println("Inserisci nome");
				testo = in.nextLine();
				query = "SELECT * FROM uffici WHERE nome = '"+ testo +"'";
				System.out.println(risQuery(query));
			}else if(scelta == 0) {
				System.out.println("Chiudo");
			}else {
				System.out.println("Scelta non valida");
			}
		}while(scelta != 0);
			

		//Vado quando esco dal WHILE
		
	}
	
	public static String risQuery(String query) {
		String ris = "Errore";
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/javaDB", "root", "root");
			
			
			Statement st = conn.createStatement();
			
			ResultSet rs = st.executeQuery(query);
			
			ris = "+++++";
			while(rs.next()) {
				
				ris += "\nNome: " + rs.getString("nome") + " Piano: " + rs.getString("piano") + " Interno: " + rs.getString("interno") + " Stanza: " + rs.getString("stanza") + "\n";
				
			}
			ris += "+++++\n";
			
			conn.close(); //Chiudo la connessione al DB
			
			return ris;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ris;
		}
	}

}
