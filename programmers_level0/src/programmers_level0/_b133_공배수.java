package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181866
 * */

public class _b133_°ø¹è¼ö {
	public static void main(String[] arg) {
		System.out.println((solution(98, 2)));
	}

	public static int solution(int num, int n) {
		return num % n == 0 ? 1 : 0;
	}

}