package jp.co.brainnet.skillcheck.b;

import java.sql.*;

public class Question5 {

  private static final String url       = "jdbc:mysql://192.168.137.0:3306/skillcheck";
  private static final String user      = "user";
  private static final String password  = "pass";
  private static final String select    = "SELECT * FROM accounts";
//private static final String insert    = "INSERT INTO accounts VALUES (0000011, 松井ゴジラ, 5500000)";
  private static final String insert    = "INSERT INTO accounts VALUES ('0000011', '松井ゴジラ', 5500000)";

  public static void main(String[] args) {

    try (Connection con = DriverManager.getConnection(url, user, password);
        Statement stmt = con.createStatement();) {

      Class.forName("com.mysql.jdbc.Driver");

      System.out.println("---------- 追加前 ----------");
      try (ResultSet rs = stmt.executeQuery(select);) {
        while (rs.next()) {
          System.out.print(rs.getString(1) + "\t");
          System.out.print(rs.getString(2) + "\t");
          System.out.println(rs.getInt(3));
        }
      } catch (SQLException e) {
        e.printStackTrace();
      }

//    stmt.executeQuery(insert);
      stmt.executeUpdate(insert);

      System.out.println("---------- 追加後 ----------");
      try (ResultSet rs = stmt.executeQuery(select);) {
        while (rs.next()) {
          System.out.print(rs.getString(1) + "\t");
          System.out.print(rs.getString(2) + "\t");
          System.out.println(rs.getInt(3));
        }
      } catch (SQLException e) {
        e.printStackTrace();
      }
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
  }
}
