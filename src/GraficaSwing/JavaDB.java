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
	
}
