package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/340203
 * */

public class _b199_°¡Ã¤Á¡ {
	public static void main(String[] arg) {
		int[] numbers = { 1 };
		int[] our_score = { 100 };
		int[] score_list = { 100, 80, 90, 84, 20 };
		System.out.println(Arrays.toString(solution(numbers, our_score, score_list)));

	}

	public static String[] solution(int[] numbers, int[] our_score, int[] score_list) {
		int num_student = numbers.length;
		String[] answer = new String[num_student];

		for (int i = 0; i < num_student; i++) {
			if (our_score[i] == score_list[numbers[i] - 1]) {
				answer[i] = "Same";
			} else {
				answer[i] = "Different";
			}
		}

		return answer;
	}
}
