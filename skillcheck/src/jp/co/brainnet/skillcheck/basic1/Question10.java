package jp.co.brainnet.skillcheck.basic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class Question10 {
  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    // 正の整数 N を取得
    String line = br.readLine();
    int n = Integer.parseInt(line);

    // 奇数か偶数か判定
    String result = null;
    if (n % 2 == 0) {
      result = "even";
    } else {
      result = "odd";
    }

    // 標準出力で出力
    System.out.println(result);
  }
}
