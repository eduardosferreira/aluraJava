package application;

import java.sql.Connection;

import db.DB;

public class Program {

	public Program() {
		Connection conn = DB.getConnection();
		DB.closeConnection();
	}

	public static void main(String[] args) {
		new Program();
	}

}
