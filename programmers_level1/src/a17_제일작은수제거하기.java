import java.util.Arrays;
import java.util.Scanner;

public class a17_���������������ϱ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 4, 3, 2, 1 };
		int[] answer = new Solution17().solution(arr);
		System.out.println(Arrays.toString(answer));

	}
}

class Solution17 {
	public int[] solution(int[] arr) {
		/*
		 * / int[] answer = {-1}; Arrays.sort(arr); if (arr.length > 1) { answer = new
		 * int[arr.length - 1]; // 3 for (int i = answer.length - 1; i >= 0; i--) { //
		 * 2~0���� 3���ݺ� answer[i] = arr[i + 1]; // �Ųٷ� ���� } } return answer; /
		 **/

		/**/

		if (arr.length <= 1) {// �迭 ���̰� 1�����ΰ�� -1 ��ȯ
			int[] answer = { -1 };
			return answer;
		}

		// �迭���̰� 1���� Ŭ���
		int[] answer = new int[arr.length - 1];

		int min = arr[0]; // �ϳ��� ���� �������� ����.

		for (int i = 0; i < arr.length; i++) {// ���� ���� �� ���ϱ�
			min = Math.min(min, arr[i]);
			System.out.println(min);
		}

		int cnt = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != min) { // cnt++�� ����� ���������� ����
				answer[cnt++] = arr[i];
			}
		}

		return answer;
		/**/

	}
}
