package programmers_level0;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/181927

public class _a75_마지막두원소 {
	public static void main(String[] arg) {
		int[] parts = { 2, 1, 6 };

		System.out.println(Arrays.toString(solution(parts)));
	}

	public static int[] solution(int[] num_list) {
		int nLength = num_list.length;
		int last = num_list[nLength - 1];
		int prev = num_list[nLength - 2];

		int[] answer = new int[nLength + 1];

		for (int i = 0; i < nLength; i++) {
			answer[i] = num_list[i];
		}

		if (last > prev) {
			answer[nLength] = last - prev;
		} else {
			answer[nLength] = last * 2;
		}
		return answer;
	}

}