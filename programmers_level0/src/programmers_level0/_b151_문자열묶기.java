package programmers_level0;

import java.util.HashMap;
import java.util.Map;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181855
 * */

public class _b151_���ڿ����� {
	public static void main(String[] arg) {
		String[] arr1 = { "a", "bc", "d", "efg", "hi" };
		System.out.println((solution2(arr1)));
	}

	// ���1 ����(1~30)�� �۰� �����Ǿ� ���� �� ����
	public static int solution(String[] strArr) {
		// ���ڿ� �ִ� ���̰� 30�̹Ƿ� ũ�� 31¥�� �迭 �غ�
		int[] cnt = new int[31];
		int max = 0;
		for (String s : strArr) {
			cnt[s.length()]++;
		}
		// �ִ� ���ϱ�
		for (int c : cnt) {
			if (c > max)
				max = c;
		}

		return max;
	}

	// ��� 2 �پ��� �������� �׷����ؾ� �� �� �� ����
	public static int solution2(String[] strArr) {
		Map<Integer, Integer> map = new HashMap<>();

		// ���ڿ� ���̺� ī��Ʈ
		for (String s : strArr) {
			int len = s.length();
			map.put(len, map.getOrDefault(len, 0) + 1);
		}

		// �ִ� ã��
		int max = 0;
		for (int count : map.values()) {
			max = Math.max(max, count);
		}

		return max;
	}
}