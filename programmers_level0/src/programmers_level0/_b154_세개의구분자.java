package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181862
 * */

public class _b154_�����Ǳ����� {
	public static void main(String[] arg) {
		System.out.println((Arrays.toString(solution("baconlettucetomato"))));
		System.out.println((Arrays.toString(solution("cabab"))));
	}

	public static String[] solution(String myStr) {
		String[] arr = myStr.split("[abc]");
		// �迭���̰� 0�̶�� EMPTY ����
		if (arr.length == 0) {
			return new String[] { "EMPTY" };
		}

		// �� ���ڿ� �ƴ� ���� ����
		int cnt = 0;
		for (String s : arr) {
			if (!s.isEmpty())
				cnt++;
		}
		// �� ũ�⸸ŭ �� �迭 ����
		String[] result = new String[cnt];
		int idx = 0;
		for (String s : arr) {
			if (!s.isEmpty()) {
				result[idx++] = s;
			}
		}
		return result;
	}

}