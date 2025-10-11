package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/120840
 * */

public class _b175_�����������°���Ǽ� {
	public static void main(String[] arg) {

		System.out.println((solution2(5, 3)));
	}

	// ��Ʈ ((n-m)! x m!) n! (!�� ���丮��)
	public static int solution2(int balls, int share) {
		long result = 1;
		// nCr = n * (n-1) * ... * (n - r + 1) / (1 * 2 * ... * r)
		for (int i = 1; i <= share; i++) {
			result = result * (balls - i + 1) / i;
		}
		return (int) result;
	}

	/*
	 * �� Ǯ�̹���� �ȵǴ� ���� 
	 * 30!�� �� 2.65 �� 10^32�� **long�� �ִ밪(�� 9.22 �� 10^18)**�� �ξ� �ʰ�
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
