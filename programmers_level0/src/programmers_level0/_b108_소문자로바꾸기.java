package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181876
 * */

public class _b108_소문자로바꾸기 {
	public static void main(String[] arg) {
		System.out.println(solution("aBcDeFg"));
	}

	public static String solution(String myString) {
        return myString.toLowerCase();
    }

}