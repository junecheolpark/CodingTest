package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181939
 * */

public class _b119_더크게합치기 {
	public static void main(String[] arg) {
		System.out.println(solution(9, 91));
	}

	public static int solution(int a, int b) {
		int num = Integer.parseInt("" + a + b);
		int num2 = Integer.parseInt("" + b + a);
		return Math.max(num, num2);
	}

}