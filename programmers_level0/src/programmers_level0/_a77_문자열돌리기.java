package programmers_level0;

import java.util.Scanner;

// https://school.programmers.co.kr/learn/courses/30/lessons/181945

public class _a77_문자열돌리기 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}

}