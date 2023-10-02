package GestioneDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDbConnection {

	public static void main(String[] args) {
		
		
		try {
			//Vado a creare la connessione con il DataBase inserendo l'url del DataBase con il nome del BD da prendere in considerazione e inserisco user name e password
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:8889/javaDB", "root", "root");
			//System.out.println("Connessione riuscita"); //Verifico se è tutto ok
			
			//Stabilisco la connessione per poter lavorare con il DataBase Selezionato
			Statement st = connect.createStatement();
			
			
			//Vado a scrivere la query in una variabile String
			String query = "SELECT * FROM utenti";
			
			//Vado ad esegurie la query e salvare i risultati. I valorei di ritorno della query si salvano come ResultSet
			ResultSet rs = st.executeQuery(query);
			
			//ResultSet è un array di array associativo
			
			//Per stampare tutti i risultati uso un while
			while(rs.next()) { //Finchè c'è una riga
				System.out.println("");//Metto una riga vuota per dare uno spazzio tra i dati
				System.out.println("Nome: " + rs.getString("nome"));
				System.out.println("Cognome: " + rs.getString("cognome"));
				System.out.println("Residenza: " + rs.getString("residenza"));
				System.out.println("Età: " + rs.getInt("eta"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Errore di connessione");
			e.printStackTrace();
		}

	}

}
