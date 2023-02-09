package programmers_level0;

import java.util.Arrays;
import java.util.Scanner;

public class _a03_배열뒤집기 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int[] n = { 1, 2, 3, 4, 5 };
		int[] answer = solution1(n);
		System.out.println(Arrays.toString(answer));
	}

	public static int[] solution1(int[] num_list) {
		int[] answer = new int[num_list.length];

		for (int i = 0; i < num_list.length; i++) {
			int a = num_list[i];
			answer[num_list.length - i - 1] = a;
		}
		return answer;
	}
}
