package jp.co.brainnet.skillcheck.b;

import java.sql.*;

public class Question1 {

  public static void main(String[] args) {

    Connection con = null;
    final String url = "jdbc:mysql://192.168.137.0:3306/skillcheck";
    final String user = "user";
    final String password = "pass";

    try {
      Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection(url, user, password);
      System.out.println("接続しました。");
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
/*
    try-with-resources文を使ったサンプル
    try (Connection conn = DriverManager.getConnection(url, user, password);) {
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("接続しました。");
    } catch (Exception e) {
      e.printStackTrace();
    }
*/
  }
}
