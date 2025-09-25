package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181900
 * */

public class _b144_글자지우기 {
	public static void main(String[] arg) {
		int[] arr1 = { 1, 16, 6, 15, 0, 10, 11, 3 };
		System.out.println(((solution("apporoograpemmemprs", arr1))));
	}

	// 정렬후 순서대로 담기
	public static String solution(String my_string, int[] indices) {
		Arrays.sort(indices); // 정렬
		StringBuilder sb = new StringBuilder();

		int idx = 0; // indices 포인터
		for (int i = 0; i < my_string.length(); i++) {
		    if (idx < indices.length && i == indices[idx]) {
		        idx++; // 지워야 할 문자면 넘어감
		    } else {
		        sb.append(my_string.charAt(i));
		    }
		}

		return sb.toString();
	}
}