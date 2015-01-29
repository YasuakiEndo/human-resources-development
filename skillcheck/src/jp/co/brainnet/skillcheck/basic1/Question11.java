package jp.co.brainnet.skillcheck.basic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class Question11 {
  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    // 西暦 a, b の取得
    String line = br.readLine();
    String[] array = line.trim().split(" ");
    int a = Integer.parseInt(array[0]);
    int b = Integer.parseInt(array[1]);

    // 標準出力で出力
    System.out.println(b - a);
  }
}
