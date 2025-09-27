package programmers_level0;

import java.util.Scanner;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181950
 * */

public class _b157_문자열반복해서출력하기 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int n = sc.nextInt();
		System.out.println(str.repeat(n));
	}
}