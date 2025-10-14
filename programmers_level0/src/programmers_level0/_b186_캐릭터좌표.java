package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/120861
 * */

public class _b186_Ä³¸¯ÅÍÁÂÇ¥ {
	public static void main(String[] arg) {
		String[] arr = { "left", "right", "up", "right", "right" };
		String[] arr3 = { "down", "down", "down", "down", "down" };
		int[] arr2 = { 7, 9 };
		System.out.println(Arrays.toString(solution(arr3, arr2)));
	}

	public static int[] solution(String[] keyinput, int[] board) {
		int transMax = board[0] / 2;
		int lengthMax = board[1] / 2;
		int[] answer = new int[2];
		for (String str : keyinput) {
			if (str.equals("up")) {
                if (answer[1] + 1 <= lengthMax) answer[1]++;
            } else if (str.equals("down")) {
                if (answer[1] - 1 >= -lengthMax) answer[1]--;
            } else if (str.equals("left")) {
                if (answer[0] - 1 >= -transMax) answer[0]--;
            } else if (str.equals("right")) {
                if (answer[0] + 1 <= transMax) answer[0]++;
            }
		}
		return answer;
	}
}
