package jp.co.brainnet.skillcheck;

import java.sql.*;

public class Question1 {

	public static void main(String[] args) {

		Connection con	= null;
		String url		= "jdbc:mysql://localhost/test";
		String user		="admin";
		String password	= "";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null && !con.isClosed()) {
					con.close();
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
//		try-with-resources文を使ったサンプル
//		try (Connection conn = DriverManager.getConnection(url, user, password);){
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}
}
