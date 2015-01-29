package jp.co.brainnet.skillcheck.basic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class Question08 {

  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    // 距離 n と単位 s を取得
    String line  = br.readLine();
    String[] array = line.trim().split(" ");
    int n    = Integer.parseInt(array[0]); // 距離
    String s = array[1];                   // 単位

    // 単位を「mm」に換算
    switch (s) {
    case "km":
      n *= 1000; // km→m
    case "m":
      n *= 100;  //  m→cm
    case "cm":
      n *= 10;   // cm→mm
      break;
    default:
      break;
    }

    // 標準出力で出力
    System.out.println(n);
  }
}
