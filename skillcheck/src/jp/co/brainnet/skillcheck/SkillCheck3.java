package jp.co.brainnet.skillcheck;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/** 掛け算のリスト */
public final class SkillCheck3 {

  private SkillCheck3() {
  }

  public static void main(final String[] args) {

    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

      String inStr = br.readLine();
      int num = Integer.parseInt(inStr);
      StringBuilder sb = new StringBuilder();
      for (int i = 1; i <= 9; i++) {
        if (i != 1) {
          sb.append(" ");
        }
        sb.append(num * i);
      }
      System.out.println(sb.toString());

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
