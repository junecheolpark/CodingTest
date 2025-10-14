package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181943
 * */

public class _b183_문자열겹쳐쓰기 {
	public static void main(String[] arg) {
		System.out.println((solution("He11oWor1d", "lloWorl", 2)));
	}

	public static String solution(String my_string, String overwrite_string, int s) {
		StringBuilder sb = new StringBuilder(my_string);
		sb.replace(s, s + overwrite_string.length(), overwrite_string);
		return sb.toString();
	}
}
