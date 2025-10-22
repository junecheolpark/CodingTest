package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/120878
 * */

public class _b200_유한소수판별하기 {
	public static void main(String[] arg) {
		System.out.println((solution(7, 20)));

	}

	private static int solution(int a, int b) {
		// 1. 최대공약수로 약분
		int gcd = gcd(a, b);
		b /= gcd;

		// 2. 분모에서 2와 5 제거
		while (b % 2 == 0) {
			b /= 2;
		}
		while (b % 5 == 0) {
			b /= 5;
		}

		// 3. 남은 분모 확인
		return (b == 1) ? 1 : 2;
	}

	// 최대공약수 함수 (유클리드 호제법)
	private static int gcd(int x, int y) {
		while (y != 0) {
			int temp = x % y;
			x = y;
			y = temp;
		}
		return x;
	}
}
