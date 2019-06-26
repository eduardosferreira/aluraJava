package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DB {

	private static Connection conn = null;
	public static Statement st = null;
	public static ResultSet rs = null;
	
	public static Connection getConnection() {
		if (DB.conn == null) {
			Properties props = DB.loadProperties();
			String url = props.getProperty("dburl");
			try {
				Connection connAux = DriverManager.getConnection(url,props);
				setConnection(connAux);
			} catch (SQLException e) {
				throw new DbException(e.getMessage());				
			}			
		}
		try {
			DB.st = DB.conn.createStatement();
		} catch (SQLException e) {
			throw new DbException(e.getMessage());				
		}			
		return DB.conn;
	}

	
	public static void newConnection() {
		if (DB.conn == null) {
			Properties props = DB.loadProperties();
			String url = props.getProperty("dburl");
			try {
				Connection connAux = DriverManager.getConnection(url,props);
				setConnection(connAux);
			} catch (SQLException e) {
				throw new DbException(e.getMessage());				
			}			
		}
		try {
			DB.st = DB.conn.createStatement();
		} catch (SQLException e) {
			throw new DbException(e.getMessage());				
		}
		
	}

	private static void setConnection(Connection conn) {
		DB.conn = conn;
	}
	
	public static void closeConnection() {
		if (DB.conn != null) {
			try {
				DB.conn.close();				
			} catch (SQLException e) {
				throw new DbException(e.getMessage());				
			}			
		}
		DB.conn = null;
		DB.closeResultSet(DB.rs);
		DB.closeStatement(DB.st);
	}

	public static void closeStatement(Statement st) {
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());				
			}			
		}
	}

	public static void closeResultSet(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());				
			}			
		}
	}
	
	
	
	private static Properties loadProperties() {
		try (FileInputStream fs = new FileInputStream("db.properties")) {
			Properties props = new Properties();
			props.load(fs);
			return props;
		} catch (IOException e) {
			throw new DbException(e.getMessage());
		}		
	}


}
