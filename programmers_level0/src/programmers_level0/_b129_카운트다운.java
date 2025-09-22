package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181899
 * */

public class _b129_墨款飘促款 {
	public static void main(String[] arg) {
		System.out.println(Arrays.toString(solution(10, 3)));
	}

	// 规过1
	public static int[] solution(int start_num, int end_num) {
		int[] answer = new int[start_num - end_num + 1];
		for (int i = start_num; end_num <= i; i--) { // 10~3
//			System.out.println("start_num:" + start_num + ", i: " + i + " = " + (start_num - i));
			answer[start_num - i] = i;
		}
		return answer;
	}

}