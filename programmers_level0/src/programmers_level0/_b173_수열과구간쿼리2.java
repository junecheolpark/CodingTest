package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181923
 * */

public class _b173_��������������2 {
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

			int min = Integer.MAX_VALUE; // k���� ū �� �� �ּҰ��� ����
			for (int i = s; i <= e; i++) {
				if (arr[i] > k && arr[i] < min) {
					min = arr[i];
				}
			}

			// ���ǿ� �´� ���� ������ -1
			result[j] = (min == Integer.MAX_VALUE) ? -1 : min;
		}

		return result;
	}
}
