package jp.co.brainnet.skillcheck.basic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class Question07 {

  /** 区切り文字 */
  private static final String DELIMITER = " ";

  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    // 箱の数n, ボールの半径r を取得
    String line1 = br.readLine();
    String[] array1 = line1.trim().split(DELIMITER);
    int n = Integer.parseInt(array1[0]); // 箱の数
    int r = Integer.parseInt(array1[1]); // ボールの半径

    StringBuilder sb = new StringBuilder(0);

    // 二行目以降は箱の情報
    for (int i = 1; i <= n; i++) {
      String line2 = br.readLine();
      String[] array2 = line2.trim().split(DELIMITER);

      int h = Integer.parseInt(array2[0]); // 高さ
      int w = Integer.parseInt(array2[1]); // 幅
      int d = Integer.parseInt(array2[2]); // 奥行

      // 高さ、幅、奥行 の最小値を求める
      int min = Math.min(Math.min(h, w), d);

      // ボールの直径が、箱の最小の一辺以下なら収納可能
      if (r * 2 <= min) {
        sb.append((sb.length() > 0 ? "\n" : "") + i);
      }
    }

    System.out.println(sb.toString());
  }
}
