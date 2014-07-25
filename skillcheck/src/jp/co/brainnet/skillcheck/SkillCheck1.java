package jp.co.brainnet.skillcheck;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/** 文字列の比較 */
public final class SkillCheck1 {

	private SkillCheck1() {
	}

	public static void main(final String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			String str = br.readLine();
			String[] strAllay = str.split(" ");

			boolean isSame = false;
			if (strAllay[0] == null) {
				isSame = strAllay[1] == null;
			} else if (strAllay[0].equals("")) {
				isSame = strAllay[1].equals("");
			} else {
				isSame = strAllay[0].equals(strAllay[1]);
			}

			System.out.println(isSame ? "True" : "False");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
