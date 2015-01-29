package jp.co.brainnet.skillcheck.basic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public final class Question02 {

  /** 区切り文字 */
  private static final String DELIMITER = " ";

  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    // パラメータNの個数, ユーザーの人数M, トップK
    String line1 = br.readLine();
    String[] array = line1.trim().split(DELIMITER);

    // パラメータNの個数
    int n = Integer.parseInt(array[0]);
    // ユーザーの人数M
    int m = Integer.parseInt(array[1]);
    // トップK
    int k = Integer.parseInt(array[2]);

    // N個のパラメータの各係数Ci
    String line2 = br.readLine();
    String[] array2 = line2.trim().split(DELIMITER);

    // 各ユーザーのXiの数値
    Integer[] sArray = new Integer[m];
    for (int i = 0; i < m; i++) {
      String line3 = br.readLine();
      String[] array3 = line3.trim().split(DELIMITER);
      float s = 0;
      for (int j = 0; j < n; j++) {
        float ci = Float.parseFloat(array2[j]);
        float xi = Float.parseFloat(array3[j]);
        s += (ci * xi);
      }

      // 四捨五入
      sArray[i] = Math.round(s);
    }

    // 降順にソート
    Arrays.sort(sArray, Collections.reverseOrder());

    // 標準出力で出力
    for (int i = 0; (i < k) && (i < sArray.length); i++) {
      System.out.println(sArray[i]);
    }
  }
}
