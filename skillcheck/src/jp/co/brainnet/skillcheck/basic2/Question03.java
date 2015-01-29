package jp.co.brainnet.skillcheck.basic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class Question03 {

  /** 確定ボタン. */
  private static final char ENTER = 'E';

  /** 変換パターンの定義. */
  private static final Map<String, String[]> PATTERN_MAP;
  static {
    HashMap<String, String[]> map = new HashMap<String, String[]>();
    map.put("1", new String[] { ".", "@", "-", "_", "/", ":", "~", "1" });
    map.put("2", new String[] { "a", "b", "c", "A", "B", "C", "2" });
    map.put("3", new String[] { "d", "e", "f", "D", "E", "F", "3" });
    map.put("4", new String[] { "g", "h", "i", "G", "H", "I", "4" });
    map.put("5", new String[] { "j", "k", "l", "J", "K", "L", "5" });
    map.put("6", new String[] { "m", "n", "o", "M", "N", "O", "6" });
    map.put("7", new String[] { "p", "q", "r", "s", "P", "Q", "R", "S", "7" });
    map.put("8", new String[] { "t", "u", "v", "T", "U", "V", "8" });
    map.put("9", new String[] { "w", "x", "y", "z", "W", "X", "Y", "Z", "9" });
    PATTERN_MAP = Collections.unmodifiableMap(map);
  }

  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    String line = br.readLine();
    if (line == null) {
      System.out.println("入力値不正");
      return;
    }

    int inLength = line.length();
    int index = 0;
    String[] strs;
    StringBuilder outStr = new StringBuilder();
    for (int i = 0; i < inLength; i++) {
      char c = line.charAt(i);
      if (c == ENTER) {

        // 変換を確定
        continue;
      }

      // 次の文字が同じか
      boolean isSame = false;
      if (i + 1 < inLength) {
        char next = line.charAt(i + 1);
        if (c == next) {
          isSame = true;
        }
      }

      // 連続する場合何文字続いているか
      if (isSame) {
        index++;
      } else {

        // 配列の決定
        strs = PATTERN_MAP.get(String.valueOf(c));

        // 出力文字列に追加
        index = index % strs.length;
        outStr.append(strs[index]);

        // indexをリセット
        index = 0;
      }
    }

    System.out.println(outStr.toString());
  }
}
