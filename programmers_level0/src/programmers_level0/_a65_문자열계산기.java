package programmers_level0;

import java.util.Arrays;

public class _a65_���ڿ����� {
	public static void main(String[] arg) {
		// int[] arr1 = { 1, 2, 3, 4 };
		System.out.println((solution("3 + 4")));
	}

	public static int solution(String my_string) {
		int answer = 0;
		String str = "+";
		String[] arr = my_string.split(" ");

		// �ݺ����� ���� ��ȣ�� �Ǻ��Ͽ� ���ϰų� ����
		for (int i = 0; i < arr.length; i++) {
			if (!arr[i].replaceAll("[0-9]", "").equals("")) {// ���ڰ� �ƴ϶��
				str = arr[i];
			} else {
				if (str.equals("+")) {
					answer += Integer.parseInt(arr[i]);
				} else {
					answer -= Integer.parseInt(arr[i]);
				}
			}
		}
		return answer;
	}
}