package programmers_level0;

import java.util.Scanner;

public class _a36_직각삼각형출력하기 {
	public static void main(String[] arg) {
		// int[] arr = { 1, 2, 3, 4, 5 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void solution(String my_string) {
	}
}
//
/*
 * for(int i=1; i<=n; i++){
            System.out.println("*".repeat(i));
        }
 */
