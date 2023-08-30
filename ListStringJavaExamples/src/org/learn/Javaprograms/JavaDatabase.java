package org.learn.Javaprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class JavaDatabase {

	public static void main(String[] args) throws ClassNotFoundException ,SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://root@localhost/firstdatabase");
		Statement statement=connection.createStatement();

		ResultSet resultset=statement.executeQuery("SELECT * FROM tbl_login");

		while (resultset.next()) {
			System.out.println(resultset.getString(2));
		}
		resultset=null;
		statement=null;
		connection=null;
	}
}