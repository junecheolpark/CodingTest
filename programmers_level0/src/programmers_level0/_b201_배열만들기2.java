package programmers_level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181921
 * */

public class _b201_배열만들기2 {
	public static void main(String[] arg) {
		System.out.println(Arrays.toString(solution(5, 555)));

	}

	private static int[] solution(int l, int r) {
		List<Integer> list = new ArrayList<>();

		for (int i = l; i <= r; i++) {
			String s = String.valueOf(i);
			boolean valid = true;
			for (char c : s.toCharArray()) {
				if (c != '0' && c != '5') {
					valid = false;
					break;
				}
			}
			if (valid)
				list.add(i);
		}

		if (list.isEmpty()) {
			return new int[] { -1 };
		}

		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}
