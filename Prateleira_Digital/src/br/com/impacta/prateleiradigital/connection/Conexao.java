package br.com.impacta.prateleiradigital.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private Connection con = null;
	
	public Conexao() {}
	
	public Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/imdb";
		String user = "root";
		String password = "impacta1";
		
		
		
		try {
			this.con =DriverManager.getConnection(url, user, password);
			return con;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		return con;
	}

}
