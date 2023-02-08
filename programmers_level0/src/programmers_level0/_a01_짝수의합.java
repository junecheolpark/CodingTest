package programmers_level0;

import java.util.Scanner;

public class _a01_짝수의합 {

	public void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = solution(n);
		System.out.println(answer);
	}

	public int solution(int n) {
		int answer = 0;
		while (n != 0) {// n 이 0이 아니라면
			answer += n % 10; // 1의자리수를 구해 더해줌
			n /= 10; // 10씩 나눠줌
			System.out.println(answer);
		}
		return answer;
	}
}
