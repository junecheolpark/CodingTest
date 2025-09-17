package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181852
 * */

public class _a92_뒤에서5등위로 {
	public static void main(String[] arg) {
		int[] arr = { 12, 4, 15, 46, 38, 1, 14, 56, 32, 10 };
		System.out.println(Arrays.toString(solution(arr)));
	}

	public static int[] solution(int[] num_list) {
		Arrays.sort(num_list);
		int[] answer = new int[num_list.length - 5];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = num_list[i + 5];
		}
		return answer;
	}

}