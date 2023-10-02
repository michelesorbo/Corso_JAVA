package GestioneDB;

import java.sql.*;
import java.util.Scanner;

public class cercaDB {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int RowCount = 0;
		String residenza, query;
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/javaDB", "root", "root");
			
			System.out.println("Inserisci una città e ti mostro gli utenti:");
			residenza = in.nextLine();
			
			Statement st = conn.createStatement();
			
			query = "SELECT nome, cognome, eta FROM utenti WHERE residenza = '"+ residenza +"'";
			
			
			ResultSet rs = st.executeQuery(query);
			
			
			while(rs.next()) {
				System.out.println("");
				System.out.print("Nome: " + rs.getString("nome") + " Cognome: " + rs.getString("cognome") + " Età: " + rs.getInt("eta") );
				RowCount++;
			}
			
			if(RowCount == 0) {
				System.out.println("\nNon ci sono utenti residenti a " + residenza);
			}else {
				System.out.println("\nUtenri residenti a " + residenza + " sono: " + RowCount);
			}
			
			
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
