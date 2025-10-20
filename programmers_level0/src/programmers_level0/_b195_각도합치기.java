package programmers_level0;

import java.util.Scanner;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/120882
 * */

public class _b195_각도합치기 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int angle1 = sc.nextInt();
		int angle2 = sc.nextInt();

		int sum_angle = angle1 + angle2;
		System.out.println(sum_angle % 360);

	}
}
