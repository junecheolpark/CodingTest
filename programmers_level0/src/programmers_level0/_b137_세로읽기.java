package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181904
 * */

public class _b137_세로읽기 {
	public static void main(String[] arg) {
		System.out.println((solution("ihrhbakrfpndopljhygc", 4, 2)));
		System.out.println((solution("programmers", 1, 1)));
	}

	public static String solution(String my_string, int m, int c) {
		StringBuilder sb = new StringBuilder();

		for (int i = c - 1; i < my_string.length(); i = i + m) { // 2~20 까지 4칸씩
			sb.append(my_string.charAt(i));
		}
		return sb.toString();
	}

}