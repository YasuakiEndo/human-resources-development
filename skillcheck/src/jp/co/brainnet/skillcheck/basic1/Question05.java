package jp.co.brainnet.skillcheck.basic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class Question05 {
  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    // 正の整数を取得
    String inStr = br.readLine();
    int n = Integer.parseInt(inStr);

    // 出力文字列作成
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= 9; i++) {

      // 先頭意外は半角スペース区切り
      if (i != 1) {
        sb.append(" ");
      }
      sb.append(n * i);
    }

    // 結果の出力
    System.out.println(sb.toString());
  }
}
