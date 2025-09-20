package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181933
 * */

public class _b121_flag에따라다른값반환하기 {
	public static void main(String[] arg) {
		System.out.println(solution(-4, 7, true));
		System.out.println(solution(-4, 7, false));
	}

	public static int solution(int a, int b, boolean flag) {
		return flag ? a + b : a - b;
	}

}