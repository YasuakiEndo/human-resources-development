package jp.co.brainnet.skillcheck;

import java.io.*;
import java.sql.*;

public class Question4 {

  private static final String url       = "jdbc:mysql://192.168.137.0:3306/skillcheck";
  private static final String user      = "user";
  private static final String password  = "pass";

  public static void main(String[] args) {

    String condition = null;
    try (BufferedReader br = new BufferedReader(
        new InputStreamReader(System.in))) {
      condition = br.readLine();
    } catch (Exception e) {
      e.printStackTrace();
    }

    String sql = "SELECT * FROM accounts WHERE" + condition;
    try (
        Connection con = DriverManager.getConnection(url, user, password);
        Statement stmt  = con.createStatement();
        ResultSet rs    = stmt.executeQuery(sql);
    ) {

      Class.forName("com.mysql.jdbc.Driver");

      while (rs.next()) {
        System.out.print(rs.getString(1) + "\t");
        System.out.print(rs.getString(2) + "\t");
        System.out.println(rs.getInt(3));
      }
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
  }
}
