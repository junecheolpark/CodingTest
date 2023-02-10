package programmers_level0;

import java.util.Scanner;

public class _a04_문자열뒤집기 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int n = 7;
		int answer = solution1(n);
		System.out.println(answer);
	}

	public static int solution1(int n) {
		int answer = 0;
	    answer = (n%7 == 0) ? n/7 : n/7 +1;
	    return answer;
	}
}
