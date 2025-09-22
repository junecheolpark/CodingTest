package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181936
 * */

public class _b135_nÀÇ¹è¼ö {
	public static void main(String[] arg) {
		System.out.println((solution(60, 2, 3)));
	}

	public static int solution(int number, int n, int m) {
		return (number % n == 0 && number % m == 0) ? 1 : 0;
	}

}