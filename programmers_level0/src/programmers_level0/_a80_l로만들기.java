package programmers_level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/181834

public class _a80_l�θ���� {
	public static void main(String[] arg) {
		System.out.println((solution("abcdevwxyz")));
	}

	public static String solution(String myString) {
		// a-k ���� l�κ�ȯ
		return myString.replaceAll("[a-k]", "l");
	}
}