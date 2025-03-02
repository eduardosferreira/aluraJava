package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {

	public static void Ex1() {

		Statement st = null;
		ResultSet rs = null;
		String sql = null;
		try (Connection conn = DB.getConnection()) {
			st = conn.createStatement();
			sql = "select * from department";
			rs = st.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
			}
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
		;
	}

	public static void Ex2() {

		String sql = null;
		try {
			DB.newConnection();
			sql = "select * from department";
			DB.rs = DB.st.executeQuery(sql);
			while (DB.rs.next()) {
				System.out.println(DB.rs.getInt("Id") + ", " + DB.rs.getString("Name"));
			}
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeConnection();
		}
		;
	}

	public Program() {
		// Ex1();
		// Ex2();

	}

	public static void main(String[] args) {
		new Program();
	}

}
