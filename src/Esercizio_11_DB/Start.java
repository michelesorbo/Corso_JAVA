package Esercizio_11_DB;

import java.util.Scanner;
import java.sql.*;

public class Start {

	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int scelta;
		Statement st = null;
		
		//Apro la connessione
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/javaDB", "root", "root");
			st = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		do {
			System.out.println("Scegli cosa fare: \n1) Aggiungi utenti\n2) Inserisci Ufficio\n3) Cerca Utente \n4) Utenti per ufficio\n5) Per chiudere");
			
			scelta  = in.nextInt();
			
			if(scelta == 1) {
				aggUtenti(st);
			}
			
		}while(scelta != 5);

		
		
	}
	
	public static void aggUtenti(Statement st) {
		String nome,cognome,residenza, query;
		int eta, id_ufficio;
		System.out.println("Inserisci nome: ");
		nome = in.nextLine();
		in.nextLine();
		System.out.println("Inserisci cognome: ");
		cognome = in.nextLine();
		System.out.println("Inserisi la residenza");
		residenza = in.nextLine();
		System.out.println("Inserisci l'età");
		eta = in.nextInt();
		
		System.out.println("Inserisci l'id dell'ufficio");
		
		//Eseguo la query per visualizzare gli uffici disponibili
		try {
			ResultSet rs = st.executeQuery("SELECT id, nome FROM uffici");
			
			while(rs.next()) {
				System.out.println(rs.getInt("id") + ") " + rs.getString("nome"));
			}
		
		
			id_ufficio = in.nextInt();
			
			query = "INSERT INTO utenti (cognome,nome,eta,residenza, id_ufficio) VALUES('"+cognome+"','"+nome+"',"+eta+",'"+residenza+"', "+id_ufficio+")";
			
			st.executeUpdate(query);
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
