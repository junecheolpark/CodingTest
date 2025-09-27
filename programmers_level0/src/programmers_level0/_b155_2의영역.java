package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181894
 * */

public class _b155_2�ǿ��� {
	public static void main(String[] arg) {
		int[] arr1 = { 1, 2, 1, 4, 5, 2, 9 };
		int[] arr2 = { 1, 2, 1 };
		int[] arr3 = { 1, 2, 1, 2, 1, 2 };
		int[] arr4 = { 1, 2, 1, 2, 1, 10, 2, 1 };
		System.out.println((Arrays.toString(solution(arr1))));
		System.out.println((Arrays.toString(solution(arr2))));
		System.out.println((Arrays.toString(solution(arr3))));
		System.out.println((Arrays.toString(solution(arr4))));
	}

	public static int[] solution(int[] arr) {
		int sNum = -1, eNum = -1;
		// ù 2 �迭�� ��ġ�� ������ �迭�� ��ġ�� ����
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 2) {
				if (sNum == -1) {
					sNum = i;
				} else if (sNum != -1) {
					eNum = i;
				}
			}
		}

		if (sNum == -1) { // 2 �迭���� �������
			return new int[] { -1 };
		} else if (eNum == -1) { // ������ 2 �迭���� �������
			return new int[] { 2 };
		} else { // s~e���� �迭����
			return Arrays.copyOfRange(arr, sNum, eNum + 1);
		}

	}

}