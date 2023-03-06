package programmers_level0;

import java.util.Arrays;

public class _a52_a로b만들기 {
	public static void main(String[] arg) {
		// int[] arr2 = { 4, 455, 6, 4, -1, 45, 6 };
		int[] arr3 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println(Arrays.toString(solution(arr3, 2)));
		// System.out.println((solution(7)));
	}

	public static int[][] solution(int[] num_list, int n) {
		int[][] answer = new int[num_list.length / n][n];
		int count = 0;
		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer[i].length; j++) {
				answer[i][j] = num_list[count];
				count++;
			}
		}
		return answer;
	}
}