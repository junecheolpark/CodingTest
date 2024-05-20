package programmers_level2;

import java.util.Scanner;

//https://school.programmers.co.kr/learn/courses/30/lessons/12914
public class a11_멀리뛰기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(solution(n)); // 출력: 5
		System.out.println(solution2(n)); // 출력: 5
	}
	
	/* 피보나치 수열 
	 * 각 숫자가 두 이전 숫자의 합인 수열
	 * F(1) = 1
		F(2) = 1
		F(3) = 2 (1 + 1)
		F(4) = 3 (2 + 1)
	 * */
	
	// 방법 1
	public static long solution(int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;

		int[] dp = new int[n + 1];
		dp[1] = 1;
		dp[2] = 2;

		for (int i = 3; i <= n; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
		}

		return dp[n];
	}

	// 방법2 (시간지연으로 통과x)
	public static long solution2(int n) {
		if (n > 2) {
			return (solution2(n - 1) + (solution2(n - 2))) % 1234567;
		} else {
			return n;
		}
	}
}
