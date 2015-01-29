package jp.co.brainnet.skillcheck.basic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class Question08 {
  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    // レシートの数
    int n = Integer.parseInt(br.readLine().trim());
    // ポイント計
    int point = 0;

    // 二行目以降はレシート情報
    for (int i = 1; i <= n; i++) {

      String line2 = br.readLine();
      String[] array2 = line2.trim().split(" ");

      // レシート発効日
      String d = array2[0];
      // 購入金額
      int p = Integer.parseInt(array2[1]);

      // ポイントのレート
      float rate;
      if (d.indexOf('3') > -1) {
        rate = 0.03f; // 3 のつく日は 3%
      } else if (d.indexOf('5') > -1) {
        rate = 0.05f; // 5のつく日は 5%
      } else {
        rate = 0.01f; // 通常は 1%
      }

      // ポイントの加算
      // （小数点以下を切捨てるためintにキャスト）
      point += (int) (p * rate);
    }

    System.out.println(point);
  }
}
