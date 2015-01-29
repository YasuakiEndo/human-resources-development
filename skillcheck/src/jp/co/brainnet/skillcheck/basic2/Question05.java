package jp.co.brainnet.skillcheck.basic2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class Question05 {

  /** 区切り文字 */
  private static final String DELIMITER = " ";

  public static void main(String[] args) throws IOException {
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    // 1 行目
    String line1 = br.readLine();
    line1 = line1.trim();
    String[] lines1 = line1.split(DELIMITER);

    int a = Integer.parseInt(lines1[0]); // 工事現場のx座標
    int b = Integer.parseInt(lines1[1]); // 工事現場のy座標
    int r = Integer.parseInt(lines1[2]); // 工事現場の騒音

    // 2 行目には木陰の数
    String line2 = br.readLine();
    line2 = line2.trim();
    int n = Integer.parseInt(line2);

    StringBuilder sb = new StringBuilder();

    // 3 行目以降は各木陰の座標
    for (int i = 0; i < n; i++) {
      String line3 = br.readLine();
      line3 = line3.trim();
      String[] lines3 = line3.split(DELIMITER);

      int x = Integer.parseInt(lines3[0]); // 木陰のx座標
      int y = Integer.parseInt(lines3[1]); // 木陰のy座標

      if (sb.length() != 0) {
        sb.append("\r\n");
      }

      // 工事現場からの距離
      double px = Math.pow((x - a), 2);
      double py = Math.pow((y - b), 2);

      // 騒音エリア
      double pr = Math.pow(r, 2);

      if (px + py >= pr) {
        sb.append("silent");
      } else {
        sb.append("noisy");
      }
    }

    System.out.println(sb.toString());
  }
}
