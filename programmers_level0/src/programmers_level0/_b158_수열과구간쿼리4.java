package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181922
 * */

public class _b158_��������������4 {
	public static void main(String[] arg) {
		int[] arr1 = { 0, 1, 2, 4, 3 };
		int[][] arr2 = { { 0, 4, 1 }, { 0, 3, 2 }, { 0, 3, 3 } };
		System.out.println((Arrays.toString(solution(arr1, arr2))));
	}

	public static int[] solution(int[] arr, int[][] queries) {
		int s = 0, e = 0, k = 0;
		for (int i = 0; i < queries.length; i++) {
			s = queries[i][0];
			e = queries[i][1];
			k = queries[i][2];

			// s~e���� �ݺ��Ͽ� j�� k�� ������ �ش� arr[j] +1
			for (int j = s; j <= e; j++) {
				if (j % k == 0) {
					arr[j] += 1;

				}
			}
		}
		return arr;
	}
}
