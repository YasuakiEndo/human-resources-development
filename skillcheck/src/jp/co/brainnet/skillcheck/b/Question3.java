package jp.co.brainnet.skillcheck.b;

import java.sql.*;

public class Question3 {

  private static final String url = "jdbc:mysql://192.168.137.0:3306/skillcheck";
  private static final String user = "user";
  private static final String password = "pass";
  private static final String ddl
      = "CREATE TABLE accounts ("
      + " number VARCHAR(7) NOT NULL,"
      + " holder VARCHAR(10) DEFAULT NULL,"
      + " balance INT(11) DEFAULT NULL,"
      + " PRIMARY KEY (number)"
      + ")";
  private static final String insert
      = "INSERT INTO accounts VALUES"
      + " (\"0000001\", \"鈴木一路\", 5000000),"
      + " (\"0000002\", \"佐々木大魔人\", 5000000),"
      + " (\"0000003\", \"新庄宇宙人\", 200000),"
      + " (\"0000004\", \"長島三番\", 1000000),"
      + " (\"0000005\", \"王一本足\", 1000000),"
      + " (\"0000006\", \"三浦王様\", 500000),"
      + " (\"0000007\", \"中田貴公子\", 2000000),"
      + " (\"0000008\", \"尾崎大型\", 1200000),"
      + " (\"0000009\", \"田村柔子\", 700000),"
      + " (\"0000010\", \"高橋金子\", 800000)";

  public static void main(String[] args) {

    try (Connection con = DriverManager.getConnection(url, user, password);
        Statement stmt = con.createStatement();) {

      Class.forName("com.mysql.jdbc.Driver");
      try {
        stmt.executeUpdate(ddl);
        stmt.executeUpdate(insert);
      } catch (SQLException e) {
        System.out.println(e.getErrorCode() + ":" + e.getMessage());
      }
      try (ResultSet rs = stmt.executeQuery("SELECT * FROM accounts");) {
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
