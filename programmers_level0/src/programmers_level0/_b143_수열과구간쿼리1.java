package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181883
 * */

public class _b143_수열과구간쿼리1 {
	public static void main(String[] arg) {
		int[] arr1 = { 0, 1, 2, 3, 4 };
		int[][] arr2 = { { 0, 1 }, { 1, 2 }, { 2, 3 } };
		System.out.println((Arrays.toString(solution(arr1, arr2))));
	}

	public static int[] solution(int[] arr, int[][] queries) {
		for (int i = 0; i < queries.length; i++) {
			int s = queries[i][0];
			int e = queries[i][1];
			for (int j = s; j <= e; j++) {
				arr[j] += 1;
			}
		}
		return arr;
	}

}