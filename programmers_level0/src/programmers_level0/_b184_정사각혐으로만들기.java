package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181830
 * */

public class _b184_정사각혐으로만들기 {
	public static void main(String[] arg) {
		System.out.println(Arrays.deepToString(solution(new int[][] { { 57, 192, 534, 2 }, { 9, 345, 192, 999 } })));
	}

	public static int[][] solution(int[][] arr) {
		// 행과 열중 큰값저장
		int max = Math.max(arr.length, arr[0].length);
		int[][] answer = new int[max][max];
		// 값복사
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				answer[i][j] = arr[i][j];
			}
		}
		return answer;
	}
}
