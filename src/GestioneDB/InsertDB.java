package GestioneDB;

import java.util.Scanner;
import java.sql.*;

public class InsertDB {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String nome, cognome, residenza, query;
		int eta;

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/javaDB", "root", "root");
			
			Statement st = conn.createStatement();
			
			 //Creo le variabili senza chiedere all'utente
			 nome = "Antonio";
			 cognome = "Di Palo";
			 residenza = "Caserta";
			 eta = 35;
			 
			 //Query senza definire i coampi della tabella, i valori vanno passati TUTTI e seguendo l'ordine dei campi del DB
			 //query = "INSERT INTO utenti VALUES(null,'"+nome+"','"+cognome+"','"+residenza+"',"+eta+")";
			
			 //Queri con solo i campi obbligatori, devo definire dopo il nome della tablla i campi che voglio inserire
			 //query = "INSER INTO (nome,cognome) VALUES('"+nome+"', '"+cognome+"')";
			 
			 //Query con campi messi in modo diverso da come sono nel DB
			 query = "INSERT INTO utenti (cognome,nome,eta,residenza) VALUES('"+cognome+"','"+nome+"',"+eta+",'"+residenza+"')";
			 
			 //Una volta deciso come eseguire la query di INSERT la eseguiamo
			 
			 //Ora bisogna modificare il DB quindi si usa excecuteUpdate
			 System.out.println(st.executeUpdate(query));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
