package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181872
 * */

public class _b149_특정문자열로끝나는가장긴부분문자열찾기 {
	public static void main(String[] arg) {
		System.out.println((solution("AbCdEFG", "dE")));
		System.out.println((solution("AAAAaaaa", "a")));
	}

	public static String solution(String myString, String pat) {
		int idx = myString.lastIndexOf(pat);
		return myString.substring(0, idx + pat.length());
	}

}