/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

/**
 *
 * @author USER
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class koneksi {
	private Connection conn;
	private final String connection = "jdbc:mysql://localhost:3306/";
	private final String databaseName = "silo";
	private final String connectionOptions = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	
	private final String dbUser = "root";
	private final String dbPass = "";


	public koneksi() throws SQLException, ClassNotFoundException {
		super();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(this.connection + this.databaseName + this.connectionOptions , this.dbUser, this.dbPass);	
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConn() {
		return conn;
	}
}

