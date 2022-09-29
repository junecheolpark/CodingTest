import java.util.Arrays;
import java.util.Scanner;

public class a35_3진법뒤집기 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int n = 5;

		int answer = new Solution35().solution(n);
		System.out.println(answer);
	}
}

class Solution35 {
	public int solution(int n) {
		String answer = "";
		
		while(n >= 3) {
			answer += n % 3;
			n /= 3;
		}
		answer += n;
		
		return Integer.parseInt(answer, 3);
	}
}
