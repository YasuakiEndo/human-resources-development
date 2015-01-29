package jp.co.brainnet.skillcheck.basic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class Question09 {

  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    // Leet に変換する前の文字列を取得
    String line = br.readLine();
    int length = line.length();

    // 出力文字列作成
    StringBuilder sb = new StringBuilder();

    // Leet の置き換え規則に一致するか一文字ずつチェック
    for (int i = 0; i < length; i++) {
      char c = line.charAt(i);
      switch (c) {
      case 'A':
        sb.append('4');
        break;
      case 'E':
        sb.append('3');
        break;
      case 'G':
        sb.append('6');
        break;
      case 'I':
        sb.append('1');
        break;
      case 'O':
        sb.append('0');
        break;
      case 'S':
        sb.append('5');
        break;
      case 'Z':
        sb.append('2');
        break;
      default:
        sb.append(c);
        break;
      }
    }

    // 標準出力へ出力
    System.out.println(sb.toString());
  }
}
