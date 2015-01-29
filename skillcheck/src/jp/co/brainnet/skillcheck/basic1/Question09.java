package jp.co.brainnet.skillcheck.basic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class Question09 {
  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    // 正の整数 N を取得
    String line = br.readLine();
    int n = Integer.parseInt(line);

    // 出力文字列の作成
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      sb.append("*");
    }

    // 標準出力で出力
    System.out.println(sb.toString());
  }
}
