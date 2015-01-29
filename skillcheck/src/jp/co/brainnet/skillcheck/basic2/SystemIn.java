package jp.co.brainnet.skillcheck.basic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemIn {
  public static void main(String[] args) throws IOException {

    // InputStreamReader のオブジェクトを生成
    InputStreamReader isr = new InputStreamReader(System.in);
    // BufferedReaderオブジェクトの生成
    BufferedReader br = new BufferedReader(isr);

    // 一行だけ読み込み
    String line1 = br.readLine();
    // 数値型に変換
    int n = Integer.parseInt(line1);

    // 入力行数分繰り返し値を取得する
    for (int i = 0; i < n; i++) {

      // 一行だけ読み込み
      String line2 = br.readLine();
      // 値が区切り文字で区切られている場合、分割する
      String[] array = line2.trim().split(",");

      // 標準出力へ出力
      System.out.println(array[0] + ", " + array[1]);
    }
  }
}
