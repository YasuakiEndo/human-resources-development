package jp.co.brainnet.skillcheck.basic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class Question04 {
  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    // 正の整数aとbを取得
    String line = br.readLine();
    String[] allay = line.split(" ");
    int a = Integer.parseInt(allay[0]);
    int b = Integer.parseInt(allay[1]);

    // 同じ値の場合は「eq」と出力
    if (a == b) {
      System.out.println("eq");
    } else {
      // 値の大きい方を出力
      System.out.println(Math.max(a, b));
    }
  }
}
