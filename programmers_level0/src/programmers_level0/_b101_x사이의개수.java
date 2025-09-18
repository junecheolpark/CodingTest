package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181867
 * */

public class _b101_x사이의개수 {
	public static void main(String[] arg) {
		System.out.println(Arrays.toString(solution("oxooxoxxox")));
	}

	
	public static int[] solution(String myString) {
		// -1 옵션: 마지막에 x로 끝날 때 빈 문자열도 포함하도록 하기
		String[] arrs = myString.split("x", -1);
		int[] arri = new int[arrs.length];
		for (int i = 0; i < arri.length; i++) {
			arri[i] = arrs[i].length();
		}

		return arri;
	}

}