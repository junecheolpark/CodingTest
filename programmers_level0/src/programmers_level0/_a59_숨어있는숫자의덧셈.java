package programmers_level0;

import java.util.Arrays;

public class _a59_�����ִ¼����ǵ��� {
	public static void main(String[] arg) {
		// int[] arr2 = { 4, 455, 6, 4, -1, 45, 6 };
		// int[] arr1 = { 3, 76, 24 };
		// int[] arr2 = { 1, 2, 3, 4, 5, 6, 7 };
		// int[] arr3 = { 30, 10, 23, 6, 100 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution("aAb1B2cC34oOp")));
		// System.out.println((solution("1a2b3c4d123Z")));
	}

	public static int solution(String my_string) {
		int answer = 0;
		my_string = my_string.replaceAll("[^0-9]", " "); // ���� ���� ����
		String[] arr = my_string.split(" "); // ����������� �迭 ����
		for (int i = 0; i < arr.length; i++) {//���� �ƴ϶�� ������
			if (!arr[i].equals("")) {
				answer += Integer.valueOf(arr[i]);
			}

		}
		return answer;
	}
}