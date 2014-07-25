package jp.co.brainnet.skillcheck;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public final class SkillCheck5 {

	public static void main(final String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(
				System.in))) {

			String inStr = br.readLine();
			String[] strAllay = inStr.split(" ");

			if (strAllay.length != 2) {
				System.out.println("引数の数が不正です。");
				return;
			}
			int left = 0;
			int right = 0;
			try {
				left = Integer.parseInt(strAllay[0]);
				right = Integer.parseInt(strAllay[1]);
			} catch (NumberFormatException e) {
				System.out.println("引数の型が不正です。");
				return;
			}

			// 和
			System.out.println("和：" + (left + right));
			// 差
			System.out.println("差：" + (left - right));
			// 商
			System.out.println("商："
					+ (right == 0 ? "0による除算はできません！" : (left / right)));
			// 積
			System.out.println("積：" + (left * right));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
