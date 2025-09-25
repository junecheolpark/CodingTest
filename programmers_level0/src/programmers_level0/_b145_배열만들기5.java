package programmers_level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181912
 * */

public class _b145_�迭�����5 {
	public static void main(String[] arg) {
		String[] arr = { "0123456789", "9876543210", "9999999999999" };
		System.out.println((Arrays.toString(solution(arr, 50000, 5, 5))));
	}

	// ������ ������� ���
	public static int[] solution(String[] intStrs, int k, int s, int l) {
		List<Integer> list = new ArrayList<>();
		int subInt = 0;
		for (int i = 0; i < intStrs.length; i++) {
			// intStrs[i]�� s~k����ŭ �ڸ��� ��ȯ
			subInt = Integer.parseInt(intStrs[i].substring(s, s + l));
			// k���� ũ�ٸ� ���
			if (subInt > k) {
				list.add(subInt);
			}
		}
		// List �� int[] ��ȯ
		return list.stream().mapToInt(Integer::intValue).toArray();
	}
}