package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181857
 * */

public class _b153_�迭�Ǳ��̸�2�ǰŵ��������θ���� {
	public static void main(String[] arg) {
		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		System.out.println((Arrays.toString(solution(arr1))));
	}

	public static int[] solution(int[] arr) {
		int length = arr.length;
		int pow = 1;

		// length���� ũ�ų� ���� 2�� �ŵ����� ã��
		while (pow < length) {
			pow *= 2;
		}
		/*���1 �� �迭 ���� x ���� (���縸)*/
		int[] result = new int[pow]; // ���ο� �迭 ����, 0���� �ʱ�ȭ��
		System.arraycopy(arr, 0, result, 0, length); // ���� �迭 ����
		return result;
		/**/
		
		/*���2 �� �迭 ���� o �ణ ���� (�迭 ���� ����)/
		 return Arrays.copyOf(arr, length);
		/**/
	}

}