package programmers_level0;

import java.util.Arrays;

public class ºÐ¼öÀÇµ¡¼À {
	public static void main(String[] args) {

		System.out.println(Arrays.toString(solution(9, 2, 1, 3)));

	}

	public static int getGCD(int num1, int num2) {
		if (num1 % num2 == 0) {
			return num2;
		}
		return getGCD(num2, num1 % num2);
	}

	public static int[] solution(int denum1, int num1, int denum2, int num2) {
		int[] answer;

		denum1 *= num2;
		denum2 *= num1;
		System.out.println(denum1);
		System.out.println(denum2);
		answer = new int[] { denum1 + denum2, num1 * num2 };

		int greatest_common_divisor = getGCD(answer[0], answer[1]);
		System.out.println(greatest_common_divisor);

		answer[0] /= greatest_common_divisor;
		answer[1] /= greatest_common_divisor;

		return answer;
	}
	
	/*
	public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int gcd = getGCD(denom1, denom2);
		int lcm = (denom1 * denom2) / gcd;
		System.out.println(lcm);
		numer1 *= lcm / denom1;
		numer2 *= lcm / denom2;
		int[] answer = { numer1 + numer2, lcm };
		return answer;
	}
	*/
	
}
