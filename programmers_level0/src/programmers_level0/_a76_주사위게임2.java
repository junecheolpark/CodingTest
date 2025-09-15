package programmers_level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/181930

public class _a76_주사위게임2 {
	public static void main(String[] arg) {
		System.out.println(solution(5, 3, 3));
	}

	public static int solution(int a, int b, int c) {
		int sum1 = a + b + c;
		int sum2 = Square(a, 2) + Square(b, 2) + Square(c, 2);
		int sum3 = Square(a, 3) + Square(b, 3) + Square(c, 3);

		if (a == b && b == c) {
			return sum1 * sum2 * sum3;

		} else if (a == b || b == c || a == c) {
			return sum1 * sum2;

		} else {
			return sum1;
		}
	}

	// 제곱
	public static int Square(int n, int type) {
		return (int) Math.pow(n, type);
	}
}