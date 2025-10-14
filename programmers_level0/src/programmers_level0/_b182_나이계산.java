package programmers_level0;

import java.util.Scanner;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/250131
 * */

public class _b182_나이계산 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		String age_type = sc.next();
		int answer = 0;

		if (age_type.equals("Korea")) {
			answer = 2030 - year + 1;
		} else if (age_type.equals("Year")) {
			answer = 2030 - year;
		}

		System.out.println(answer);
	}

}
