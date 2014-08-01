package jp.co.brainnet.skillcheck.a;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/** 数の比較 */
public final class Question2 {

	private Question2() {
	}

	public static void main(final String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			String inStr = br.readLine();
			String[] strAllay = inStr.split(" ");
			int a = Integer.parseInt(strAllay[0]);
			int b = Integer.parseInt(strAllay[1]);

			if (a > b) {
				System.out.println(a);
			} else if (b > a) {
				System.out.println(b);
			} else {
				System.out.println("eq");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
