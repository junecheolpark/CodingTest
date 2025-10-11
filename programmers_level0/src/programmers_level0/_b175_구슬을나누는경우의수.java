package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/120840
 * */

public class _b175_구슬을나누는경우의수 {
	public static void main(String[] arg) {

		System.out.println((solution2(5, 3)));
	}

	// 힌트 ((n-m)! x m!) n! (!는 팩토리얼)
	public static int solution2(int balls, int share) {
		long result = 1;
		// nCr = n * (n-1) * ... * (n - r + 1) / (1 * 2 * ... * r)
		for (int i = 1; i <= share; i++) {
			result = result * (balls - i + 1) / i;
		}
		return (int) result;
	}

	/*
	 * 이 풀이방법이 안되는 이유 
	 * 30!은 약 2.65 × 10^32로 **long의 최대값(약 9.22 × 10^18)**을 훨씬 초과
	 * 
	public static int solution(int balls, int share) {
		return (int) (factorial(balls) / (factorial((balls - share)) * factorial(share)));
	}

	public static long factorial(int n) {
		long result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	/**/
}
