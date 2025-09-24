package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181942
 * */

public class _b139_¹®ÀÚ¿­¼¯±â {
	public static void main(String[] arg) {
		System.out.println((solution("aaaaa", "bbbbb")));
	}

	public static String solution(String str1, String str2) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str1.length(); i++) {
			sb.append(str1.charAt(i) + "" + str2.charAt(i));
		}
		return sb.toString();
	}

}