package br.edu.imed;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Connect {

	public static Connection connect() {
		Connection conn = null;

		try {
			System.out.println("teste 1");

			String url = "jdbc:sqlite:/home/pablomzilli/Documents/Faculdade Pablo/P.O. 2/gitFolder/frontBackPO/users";

			conn = DriverManager.getConnection(url);
			System.out.println("okay");


		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} 
		return conn;
	}
	
	public static void close(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}
	public static void main(String[] args) {
		Connect.connect();
		
	}
}
