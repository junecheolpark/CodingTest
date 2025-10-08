package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181923
 * */

public class _b173_수열과구간쿼리2 {
	public static void main(String[] arg) {
		int[] arr = { 0, 1, 2, 4, 3 };
		int[][] arr2 = { { 0, 4, 2 }, { 0, 3, 2 }, { 0, 2, 2 } };

		System.out.println(Arrays.toString(solution(arr, arr2)));
	}

	public static int[] solution(int[] arr, int[][] queries) {
		int[] result = new int[queries.length];

		for (int j = 0; j < queries.length; j++) {
			int s = queries[j][0];
			int e = queries[j][1];
			int k = queries[j][2];

			int min = Integer.MAX_VALUE; // k보다 큰 값 중 최소값을 저장
			for (int i = s; i <= e; i++) {
				if (arr[i] > k && arr[i] < min) {
					min = arr[i];
				}
			}

			// 조건에 맞는 값이 없으면 -1
			result[j] = (min == Integer.MAX_VALUE) ? -1 : min;
		}

		return result;
	}
}
