package jp.co.brainnet.skillcheck.basic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class Question06 {

  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    String n = br.readLine();                       // 嫌いな数
    int m = Integer.parseInt(br.readLine().trim()); // 病室総数

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < m; i++) {
      String r = br.readLine(); // 部屋番号

      if (r.indexOf(n) == -1) {
        sb.append((sb.length() == 0 ? "" : "\r") + r);
      }
    }

    if (sb.length() == 0) {
      sb.append("none");
    }
    System.out.println(sb.toString());
  }
}
