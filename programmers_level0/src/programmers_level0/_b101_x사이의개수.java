package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181867
 * */

public class _b101_x�����ǰ��� {
	public static void main(String[] arg) {
		System.out.println(Arrays.toString(solution("oxooxoxxox")));
	}

	
	public static int[] solution(String myString) {
		// -1 �ɼ�: �������� x�� ���� �� �� ���ڿ��� �����ϵ��� �ϱ�
		String[] arrs = myString.split("x", -1);
		int[] arri = new int[arrs.length];
		for (int i = 0; i < arri.length; i++) {
			arri[i] = arrs[i].length();
		}

		return arri;
	}

}