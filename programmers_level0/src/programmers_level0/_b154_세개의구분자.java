package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181862
 * */

public class _b154_세개의구분자 {
	public static void main(String[] arg) {
		System.out.println((Arrays.toString(solution("baconlettucetomato"))));
		System.out.println((Arrays.toString(solution("cabab"))));
	}

	public static String[] solution(String myStr) {
		String[] arr = myStr.split("[abc]");
		// 배열길이가 0이라면 EMPTY 리턴
		if (arr.length == 0) {
			return new String[] { "EMPTY" };
		}

		// 빈 문자열 아닌 개수 세기
		int cnt = 0;
		for (String s : arr) {
			if (!s.isEmpty())
				cnt++;
		}
		// 그 크기만큼 새 배열 생성
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