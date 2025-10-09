package programmers_level0;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181858
 * */

public class _b174_��������K���Ǽ��̱� {
	public static void main(String[] arg) {
		int[] arr = { 0, 1, 1, 2, 2, 3 };

		System.out.println(Arrays.toString(solution2(arr, 3)));
	}

	// ���1 contains�� add�� ��������� O(1)�̱� ������ ����
	public static int[] solution(int[] arr, int k) {
		int[] answer = new int[k];
		// �迭 ���� ���� ��� -1�� ����
		Arrays.fill(answer, -1);
		Set<Integer> set = new HashSet<>();
		int cnt = 0;

		for (int num : arr) {
			// ���� ���� �� ���� ����� �߰�
			if (!set.contains(num)) {
				set.add(num);
				answer[cnt++] = num;
			}
			// k�� �� ä��� ����
			if (cnt == k)
				break;
		}
		return answer;
	}

	// ���2 O(n �� k) �� �ϳ� ���� ������ ���ݱ��� ���� ������ ������ ���ؾ� ��
	public static int[] solution2(int[] arr, int k) {
		int[] answer = new int[k];
		boolean exists = true;
		int cnt = 0; // �迭 ���� ���� ��� -1�� ����
		Arrays.fill(answer, -1);

		for (int i = 0; i < arr.length; i++) {
			if (k == cnt) { // k���̸�ŭ ��ä��� ����
				break;
			}
			exists = false;
			for (int j = 0; j < cnt; j++) {
				if (answer[j] == arr[i]) {
					exists = true;
					break;
				}
			}

			if (!exists) {
				answer[cnt] = arr[i]; 
				cnt++;
			}
		}
		return answer;
	}
}
