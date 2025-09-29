package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181903
 * */

public class _b159_qrcode {
	public static void main(String[] arg) {
		System.out.println(((solution(3, 1, "qjnwezgrpirldywt"))));
	}

	public static String solution(int q, int r, String code) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < code.length(); i++) {
			//i/q �������� r�� ���ڸ� ���
			if (i % q == r) {
				sb.append(code.charAt(i));
			}
		}
		return sb.toString();
	}
}
