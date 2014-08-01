package jp.co.brainnet.skillcheck.a;

/**
 * 九九表を表示するプログラム
 */
public class Question4 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j != 1) {
					sb.append("\t");
				}
				sb.append(i).append("*").append(j).append("=");
				int ans = i * j;
				if (ans < 10) {
					sb.append(" ");
				}
				sb.append(ans);
				if (j == 9) {
					sb.append("\r\n");
				}
			}
		}
		System.out.print(sb.toString());
	}
}
