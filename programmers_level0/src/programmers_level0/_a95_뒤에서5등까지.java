package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181853
 * */

public class _a95_뒤에서5등까지 {
	public static void main(String[] arg) {
		int[] arr = { 12, 4, 15, 46, 38, 1, 14 };
		System.out.println(Arrays.toString(solution(arr)));
	}

	public static int[] solution(int[] num_list) {
		Arrays.sort(num_list);
		int[] answer = new int[5];
		for (int i = 0; i < 5; i++) {
			answer[i] = num_list[i];
		}
		return answer;
	}

}