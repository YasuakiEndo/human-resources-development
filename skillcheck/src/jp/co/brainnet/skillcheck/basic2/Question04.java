package jp.co.brainnet.skillcheck.basic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class Question04 {
  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    // 1行目 タグ
    String line1 = br.readLine();
    String[] array1 = line1.trim().split(" ");
    String tagA = array1[0]; // タグA
    String tagB = array1[1]; // タグB

    // 2行目 抽出処理を行う文字列データ
    String s = br.readLine();

    StringBuilder sb = new StringBuilder();
    int startIndex = 0;
    int endIndex = 0;
    while (endIndex > -1) {

      // タグBの出現位置からタグAを検索
      startIndex = s.indexOf(tagA, endIndex);
      if (startIndex == -1) {
        break;
      }

      // タグBの検索
      endIndex = s.indexOf(tagB, startIndex);
      if (endIndex == -1) {
        break;
      }

      // 文字列抽出
      String out = s.substring(startIndex + tagA.length(), endIndex);
      if (out.length() == 0) {
        out = "<blank>";
      }
      sb.append((sb.length() == 0 ? "" : "\r\n") + out);
    }
    System.out.println(sb.toString());
  }
}
