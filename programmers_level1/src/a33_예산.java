import java.util.Arrays;
import java.util.Scanner;

public class a33_¿¹»ê {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int[] d = { 1, 3, 2, 5, 4 };
		int budget = 9;
		int answer = new Solution33().solution(d, budget);
		System.out.println(answer);
	}
}

class Solution33 {
	public int solution(int[] d, int budget) {
		int cnt = 0;
		Arrays.sort(d);
		for (int i = 0; i < d.length; i++) {
			if (budget > 0) {
				budget = budget - d[i];
			} else {
				break;
			}
			cnt++;
			System.out.println("b" + budget);
		}
		if (budget < 0) {
			cnt -= 1;
		}
		System.out.println("c" + cnt);
		return cnt;
	}
}
