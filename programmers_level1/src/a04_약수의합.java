import java.util.Scanner;

public class a04_약수의합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = new Solution4().solution(n);
		System.out.println(answer);

	}

}

class Solution4 {
	public int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
				answer += i;
			}
		}
		return answer;
	}
}
