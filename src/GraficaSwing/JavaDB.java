package GraficaSwing;

import java.sql.*;

public class JavaDB {

	private Connection conn;
	private Statement st;
	
	{
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/javaDB", "root", "root");
			st = conn.createStatement();
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	//Posso creare tutit i metodi
	
	public String idUffici() {
		String ris = "";
		try {
			ResultSet rs = st.executeQuery("SELECT id, nome FROM uffici");
			
			while(rs.next()) {
				ris += rs.getInt("id") + ") " + rs.getString("nome") + " ";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ris;
	}
	
	public void insUtenti(String nome, String cognome, String residenza, String eta, String id_u) {
		String query;
		query = "INSERT INTO utenti VALUES(null, '"+nome+"', '"+cognome+"', '"+residenza+"',"+Integer.parseInt(eta)+", "+Integer.parseInt(id_u)+")";
		
		try {
			st.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public ResultSet listaUtenti(String id) {
		ResultSet rs = null;
		
		try {
			rs = st.executeQuery("SELECT * FROM utenti WHERE id = " + Integer.parseInt(id));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return rs;
	}
	
	public void modUtente(String nome, String cognome, String residenza, String eta, String id) {
		String query;
		
		query = "UPDATE utenti ";
		query += "SET nome = '" + nome + "', ";
		query += "cognome = '"+ cognome +"', ";
		query += "residenza = '" +residenza+"', ";
		query += "eta = "+Integer.parseInt(eta)+" ";
		query += "WHERE id = " + Integer.parseInt(id);
		
		System.out.println(query);
		
		try {
			st.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
