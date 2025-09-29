package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181881
 * */

public class _b160_���ǿ��°Լ�����ȯ�ϱ�2 {
	public static void main(String[] arg) {
		System.out.println((solution(new int[] { 1, 2, 3, 100, 99, 98 })));
	}

	// �迭 �� -> 1���� �迭 �� Arrays.equals(), 2���� �̻� �迭 �� Arrays.deepEquals()
	// �迭 ���� -> System.arraycopy(a, 0, b, 0, a.length), Arrays.copyOf()

	public static int solution(int[] arr) {
		int cnt = 0;
		while (true) {
			// newArr while�ۿ��� �����arr �� newArr �� ���� ��ü�� ������ �ȿ��� ����
			int[] newArr = new int[arr.length]; 
			for (int i = 0; i < arr.length; i++) { // �޼��� arr ����
				newArr[i] = arr(arr[i]);
			}
			if (Arrays.equals(arr, newArr)) { // �ι迭�̰��ٸ� ����
				return cnt;
			} else { // �ƴ϶�� ����
				arr = newArr;
			}
			cnt++;
		}
	}

	public static int arr(int x) {
		if (x >= 50 && x % 2 == 0) { // 50���� ũ�ų� ���� ¦��
			return x / 2;
		} else if (x < 50 && x % 2 != 0) { // 50���� ���� Ȧ��
			return (x * 2) + 1;
		}
		return x;
	}
}
