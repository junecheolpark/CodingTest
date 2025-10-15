package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/120869
 * */

public class _b187_�ܰ����� {
	public static void main(String[] arg) {
		String[] arr = { "z", "d", "x" };
		String[] arr2 = { "def", "dww", "dzx", "loveaw" };
		System.out.println((solution(arr, arr2)));
		System.out.println(
				(solution(new String[] { "p", "o", "s" }, new String[] { "sod", "eocd", "qixm", "adio", "soo" })));
	}

	// ������ �߸����������� ���� ���� ó����
	public static int solution(String[] spell, String[] dic) {
		int answer = 0;
		for (String d : dic) {
			for (String s : spell) {
				if (d.contains(s)) {
					answer = 1;
				} else {
					answer = 2;
					break;
				}
			}
			if (answer == 1) {
				break;
			}
		}
		return answer;
	}

	// ���2
	public static int solution2(String[] spell, String[] dic) {
		// �����Ͽ� ����
		Arrays.sort(spell);
		String sSpell = String.join("", spell);

		for (String d : dic) {
			// �����Ͽ� ����
			char[] arr = d.toCharArray();
			Arrays.sort(arr);
			String str = new String(arr);

			if (str.equals(sSpell)) {
				return 1;
			}
		}
		return 2;
	}
}
