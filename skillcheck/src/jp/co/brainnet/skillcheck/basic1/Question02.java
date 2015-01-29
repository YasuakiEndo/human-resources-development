package jp.co.brainnet.skillcheck.basic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public final class Question02 {
  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    // 1行目 数字の総数
    String line1 = br.readLine().trim();
    int i = Integer.parseInt(line1);

    int[] array = new int[i];

    // 2行目以降 正の整数
    for (int j = 0; j < i; j++) {
      String linei = br.readLine().trim();
      int n = Integer.parseInt(linei);

      // 一旦配列に格納
      array[j] = n;
    }

    // 配列を数値の昇順でソート
    Arrays.sort(array);

    // 結果の出力
    for (int out : array) {
      System.out.println(out);
    }
  }
}
