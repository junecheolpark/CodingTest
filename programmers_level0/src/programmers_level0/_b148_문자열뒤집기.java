package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181905
 * */

public class _b148_문자열뒤집기 {
	public static void main(String[] arg) {
		System.out.println((solution("Progra21Sremm3", 6, 12)));
	}

	// 방법1 가독성
	public static String solution(String my_string, int s, int e) {
		String frontStr = my_string.substring(0, s);
		String turnStr = new StringBuilder(my_string.substring(s, e + 1)).reverse().toString();
		String backStr = my_string.substring(e + 1);
		return frontStr + turnStr + backStr;
	}

	// 방법2 성능
	public static String solution2(String my_string, int s, int e) {
		char[] arr = my_string.toCharArray();
		while (s < e) {
			char temp = arr[s];
			arr[s++] = arr[e];
			arr[e--] = temp;
		}

		return new String(arr);
	}
}