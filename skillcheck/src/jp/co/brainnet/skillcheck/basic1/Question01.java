package jp.co.brainnet.skillcheck.basic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class Question01 {
  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    // 2つの正の整数a, b を取得
    String line = br.readLine();
    String[] array = line.trim().split(" ");
    int first  = Integer.parseInt(array[0]);
    int second = Integer.parseInt(array[1]);

    // 標準出力で出力
    System.out.println(first + second);
  }
}
