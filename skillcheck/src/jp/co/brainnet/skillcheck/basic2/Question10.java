package jp.co.brainnet.skillcheck.basic2;

public final class Question10 {
  public static void main(final String[] args) {

    // 出力文字列作成
    StringBuilder sb = new StringBuilder();

    // 被乗数を 1 ずつインクリメントする
    for (int i = 1; i <= 9; i++) {

      // 乗数を １ ずつインクリメントする
      for (int j = 1; j <= 9; j++) {

        if (j != 1) {
          sb.append("\t");  // 式をタブで区切る
        }
        sb.append(i).append("*").append(j).append("=");
        int ans = i * j;

        // 10未満の数は桁を揃えるために半角スペースで埋める
        if (ans < 10) {
          sb.append(" ");
        }
        sb.append(ans);
        if (j == 9) {
          sb.append("\r\n"); // 改行
        }
      }
    }

    // 標準出力へ出力
    System.out.print(sb.toString());
  }
}
