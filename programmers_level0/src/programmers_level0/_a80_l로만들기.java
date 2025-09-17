package programmers_level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/181834

public class _a80_l로만들기 {
	public static void main(String[] arg) {
		System.out.println((solution("abcdevwxyz")));
	}

	public static String solution(String myString) {
		// a-k 까지 l로변환
		return myString.replaceAll("[a-k]", "l");
	}
}