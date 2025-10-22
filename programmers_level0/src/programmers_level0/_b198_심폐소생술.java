package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/340203
 * */

public class _b198_½ÉÆó¼Ò»ý¼ú {
	public static void main(String[] arg) {
		System.out.println(Arrays.toString(solution(new String[] { "call", "respiration", "repeat", "check", "pressure" })));

	}

	public static int[] solution(String[] cpr) {
		int[] answer = { 0, 0, 0, 0, 0 };
		String[] basic_order = { "check", "call", "pressure", "respiration", "repeat" };

		for (int i = 0; i < cpr.length; i++) {
			for (int j = 0; j < basic_order.length; j++) {
				if (cpr[i].equals(basic_order[j])) {
					answer[i] = j + 1;
					break;
				}
			}
		}
		return answer;
	}
}
