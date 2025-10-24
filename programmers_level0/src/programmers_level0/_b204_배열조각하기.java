package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181893
 * */

public class _b204_�迭�����ϱ� {
	public static void main(String[] arg) {
		int[] arr = { 0, 1, 2, 3, 4, 5 };
		int[] arr2 = { 4, 1, 2 };
		System.out.println(Arrays.toString(solution(arr, arr2)));

	}

	private static int[] solution(int[] arr, int[] query) {
		int start = 0;
		int end = arr.length; // end�� �߸��� ������ "�� + 1"

		for (int i = 0; i < query.length; i++) {
			if (i % 2 == 0) {
				// ¦�� �ε���: query[i] ���ĸ� �߶�
				end = start + query[i] + 1;
			} else {
				// Ȧ�� �ε���: query[i] ������ �߶�
				start = start + query[i];
			}
		}

		// �߶� ������ ����
		return Arrays.copyOfRange(arr, start, end);
	}

}
