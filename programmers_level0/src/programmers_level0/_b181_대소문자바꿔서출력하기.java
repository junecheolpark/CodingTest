package programmers_level0;

import java.util.Scanner;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181951
 * */

public class _b181_대소문자바꿔서출력하기 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);
			if (Character.isUpperCase(ch)) {
				sb.append(Character.toLowerCase(ch));
			} else {
				sb.append(Character.toUpperCase(ch));
			}
		}

		System.out.println(sb.toString()); 
	}

}
