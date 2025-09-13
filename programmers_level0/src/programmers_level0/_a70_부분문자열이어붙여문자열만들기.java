package programmers_level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/181906

public class _a70_부분문자열이어붙여문자열만들기 {
	public static void main(String[] arg) {
		String[] my_strings = { "progressive", "hamburger", "hammer", "ahocorasick" };
		int[][] parts = { { 0, 4 }, { 1, 2 }, { 3, 5 }, { 7, 7 } };

		System.out.println((solution(my_strings, parts)));
	}

	public static String solution(String[] my_strings, int[][] parts) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < my_strings.length; i++) {
			int s = parts[i][0];
			int e = parts[i][1];
			sb.append(my_strings[i].substring(s, e + 1));
		}

		return sb.toString();
	}

}