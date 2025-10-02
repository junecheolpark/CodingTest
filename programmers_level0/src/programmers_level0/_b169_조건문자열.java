package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181934
 * */

public class _b169_조건문자열 {
	public static void main(String[] arg) {
		System.out.println((solution("<", "=", 20, 50)));
		System.out.println((solution(">", "!", 41, 78)));
	}

	public static int solution(String ineq, String eq, int n, int m) {
		boolean bool = true;
		String ineq2 = ineq + eq;
		if (ineq2.equals("<=")) {
			bool = n <= m;
		} else if (ineq2.equals("<!")) {
			bool = n < m;
		} else if (ineq2.equals(">=")) {
			bool = n >= m;
		} else if (ineq2.equals(">!")) {
			bool = n > m;
		}
		return bool ? 1 : 0;
	}

}
