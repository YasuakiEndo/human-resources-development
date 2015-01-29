package jp.co.brainnet.skillcheck.basic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class Question06 {
  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    // 入力される文字列の個数
    String str1 = br.readLine();
    int n = Integer.parseInt(str1);

    // 出力文字列作成
    StringBuilder sb = new StringBuilder("Hello ");
    for (int i = 0; i < n; i++) {

      // 先頭意外は「,」で結合
      if (i > 0) {
        sb.append(",");
      }
      sb.append(br.readLine());
    }

    // 末尾に「.」を結合
    sb.append(".");

    // 標準出力で出力
    System.out.println(sb.toString());
  }
}
