package programmers_level0;

import java.util.Scanner;

public class _a01_¦������ {

	public void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = solution(n);
		System.out.println(answer);
	}

	public int solution(int n) {
		int answer = 0;
		while (n != 0) {// n �� 0�� �ƴ϶��
			answer += n % 10; // 1���ڸ����� ���� ������
			n /= 10; // 10�� ������
			System.out.println(answer);
		}
		return answer;
	}
}
