package programmers_level0;

import java.util.Scanner;

public class _a01_�粿ġ {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int n = 10;
		int k = 3;
		int answer = solution1(n, k);
		System.out.println(answer);
	}

	public static int solution1(int n, int k) {
		int answer = 0;
		k -= n / 10;
		return (n * 12000) + (k * 2000);
	}
}
