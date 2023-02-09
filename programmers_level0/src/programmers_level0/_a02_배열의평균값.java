package programmers_level0;

import java.util.Scanner;

public class _a02_배열의평균값 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int[] n = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		double answer = solution1(n, n.length);
		System.out.println(answer);
	}

	public static double solution1(int numbers[], int numbers_len) {
		double answer = 0;
	    for(int i=0; i<numbers_len; i++){
	        answer += numbers[i];
	    }
	    return answer / numbers_len;
	}
}
