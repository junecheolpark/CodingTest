package programmers_level0;

import java.util.Scanner;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/340205
 * */

public class _b207_수나누기 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int answer = 0;

		while (number > 0) {
			answer += number % 100;
			number /= 100;
		}

		System.out.println(answer);
	}

}
