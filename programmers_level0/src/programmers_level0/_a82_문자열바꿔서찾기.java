package programmers_level0;
/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181864
 * */

public class _a82_문자열바꿔서찾기 {
	public static void main(String[] arg) {
		System.out.println(solution("ABBAA", "AABB"));
	}

	public static int solution(String myString, String pat) {
		myString = myString.replace("A", "X");
		myString = myString.replace("B", "A");
		myString = myString.replace("X", "B");

		return myString.contains(pat) ? 1 : 0;
	}
}