package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181875
 * */

public class _b106_�迭�������ڿ���ҹ��ں�ȯ�ϱ� {
	public static void main(String[] arg) {
		String[] arr = { "AAA", "BBB", "CCC", "DDD" };
		System.out.println(Arrays.toString(solution(arr)));
	}

	public static String[] solution(String[] strArr) {
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = i % 2 != 0 ? strArr[i].toUpperCase() : strArr[i].toLowerCase();
		}
		return strArr;
	}

}