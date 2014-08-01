package jp.co.brainnet.skillcheck.b;

import java.sql.*;

public class Question2 {

	public static void main(String[] args) {

		Connection con	= null;
		String url		= "jdbc:mysql://192.168.137.0:3306/skillcheck";
		String user		= "user";
		String password	= "pass";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("接続します。");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("接続しました。");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("接続中になんかエラーだって！！！");
			e.printStackTrace();
		} finally {
			try {
				if (con != null && !con.isClosed()) {
					System.out.println("切断します。");
					con.close();
					System.out.println("切断しました。");
				}
			} catch (SQLException ex) {
				System.out.println("切断中になんかエラーだって！！！");
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
