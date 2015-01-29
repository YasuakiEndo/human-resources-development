package jp.co.brainnet.skillcheck.basic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class Question03 {
  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    // 入力値を取得
    String line = br.readLine();
    String[] allay = line.split(" ");

    boolean bool = allay[0].equals(allay[1]);
    String out = bool ? "True" : "False";

    // 結果の出力
    System.out.println(out);
  }
}
