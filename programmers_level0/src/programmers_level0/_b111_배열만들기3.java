package programmers_level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181895
 * */

public class _b111_�迭�����3 {
	public static void main(String[] arg) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[][] arr2 = { { 1, 3 }, { 0, 4 } };
		System.out.println(Arrays.toString(solution(arr, arr2)));
	}

	// ���1(���� �ֿ켱) �迭�������� ����: ���� ���� ���� �� O(N) ���� �迭 ���� 

	public static int[] solution(int[] arr, int[][] intervals) {
		int inter1 = intervals[0][0], inter2 = intervals[0][1], inter3 = intervals[1][0], inter4 = intervals[1][1],
				idx = 0;
		int[] answer = new int[inter2 - inter1 + inter4 - inter3 + 2];

		for (int i = inter1; i <= inter2; i++) {
			answer[idx++] = arr[i];
		}

		for (int i = inter3; i <= inter4; i++) {
			answer[idx++] = arr[i];
		}

		return answer;
	}

	//	��� 2(�ڵ尡����) ����Ʈ Ȱ�� ����: ������ ����, �������̰� ���������� ���� arr ũ�Ⱑ ��õ�������±���

	public static int[] solution2(int[] arr, int[][] intervals) {
		List<Integer> list = new ArrayList();
		for (int i = intervals[0][0]; i <= intervals[0][1]; i++) {
			list.add(arr[i]);
		}
		for (int j = intervals[1][0]; j <= intervals[1][1]; j++) {
			list.add(arr[j]);
		}
		//������ for������ stream�� 1.5~2�� ���̳�
		return list.stream().mapToInt(Integer::intValue).toArray();
	}

}