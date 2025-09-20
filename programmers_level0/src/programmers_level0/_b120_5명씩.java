package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181886
 * */

public class _b120_5¸í¾¿ {
	public static void main(String[] arg) {
		String[] arr = { "nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx" };
		System.out.println(Arrays.toString(solution(arr)));
	}

	public static String[] solution(String[] names) {
		int nGroups = (int) Math.ceil((double) names.length / 5);
		String[] sArr = new String[nGroups];
		for (int i = 0; i < nGroups; i++) {
			sArr[i] = names[i * 5];
		}
		return sArr;
	}

}