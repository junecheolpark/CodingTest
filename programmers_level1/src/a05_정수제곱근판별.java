import java.util.Scanner;

public class a05_정수제곱근판별 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long answer = new Solution5().solution(n);
		System.out.println(answer);

	}

}

class Solution5 {
	public long solution(int n) {
		long answer = -1; //양의정수가 아니면 -1
		for (long i = 1; i <= n; i++) {//1~n까지 반복
			if (i * i == n) {
				answer = (i+1)*(i+1); // i*i==n 일경우 i+1의 제곱
			}
		}
		return answer;
	}
}
