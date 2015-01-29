package jp.co.brainnet.skillcheck.basic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class Question01 {
  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    // 入力されるIPアドレスの数
    String line1 = br.readLine();
    int m = Integer.parseInt(line1);

    // 出力文字列作成
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < m; i++) {

      // 入力されたIPアドレスを取得
      String line2 = br.readLine();

      // IPv4のアドレスとして正しいか判定します
      boolean isValid = isValidIPv4(line2);

      if (i > 0) {
        sb.append("\r\n");
      }
      sb.append(isValid ? "True" : "False");
    }

    // 標準出力へ出力
    System.out.println(sb.toString());
  }

  private static boolean isValidIPv4(String ip) {

    // .で分割した値が４つであること
    String[] array2 = ip.split("\\.");
    if (array2.length != 4) {
      return false;
    }

    for (String s : array2) {

      // 数値であり、0 から 255 の範囲であること
      try {
        int x = Integer.parseInt(s);
        if (x < 0 || x > 255) {
          return false;
        }
      } catch (NumberFormatException e) {
        return false;
      }
    }
    return true;
  }
}
