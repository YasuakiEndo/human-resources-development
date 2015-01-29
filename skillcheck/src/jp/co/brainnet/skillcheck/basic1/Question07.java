package jp.co.brainnet.skillcheck.basic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class Question07 {
  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    // 初項 m、公差 n を取得
    String line = br.readLine();
    String[] array = line.trim().split(" ");
    int m = Integer.parseInt(array[0]); // 初項 m
    int n = Integer.parseInt(array[1]); // 公差 n

    // 出力文字列の作成
    StringBuilder sb = new StringBuilder();
    int total = m;
    for (int i = 1; i <= 10; i++) {
      if (i != 1) {
        sb.append(" ");
        total += n;
      }
      sb.append(total);
    }

    // 標準出力で出力
    System.out.println(sb.toString());
  }
}
