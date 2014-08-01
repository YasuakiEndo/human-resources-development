package jp.co.brainnet.skillcheck.a;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

/**
 * カレンダーを表示するプログラム
 */
public class Question6 {
  public static void main(String[] args) {
    try (BufferedReader br
    		= new BufferedReader(new InputStreamReader(System.in))) {

      // 入力値取得
      String input = br.readLine();

      Calendar calendar = Calendar.getInstance();
      int year = calendar.get(Calendar.YEAR);
      int month = Integer.parseInt(input) - 1;

      // 月の初めの曜日を求めます。
      calendar.clear();
      calendar.set(year, month, 1);
      int startWeek = calendar.get(Calendar.DAY_OF_WEEK);

      // 月末の日付を求めます。
      calendar.clear();
      calendar.set(year, month + 1, 0);
      int lastDate = calendar.get(Calendar.DATE);

      // 表示データ作成
      StringBuilder sb = new StringBuilder();
      sb.append(month + 1).append("月\r\n");
      sb.append("--------------------\r\n");
      sb.append("日 月 火 水 木 金 土\n");
      sb.append("--------------------\r\n");

      int count = 1;
      while (startWeek-- > 1) {
        sb.append("   ");
        count++;
      }
      for (int date = 1; date <= lastDate; date++) {
        if (date < 10) {
          sb.append(" ");
        }
        sb.append(date);

        if (date != lastDate) {
          if (count % 7 == 0) {
            sb.append("\r\n");
          } else {
            sb.append(" ");
          }
          count++;
        }
      }

      sb.append("\r\n--------------------\r\n");
      System.out.println(sb.toString());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}