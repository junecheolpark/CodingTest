import java.util.Scanner;

public class a26_약수의개수와덧셈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int left = sc.nextInt();
		int right = sc.nextInt();
		int answer = new Solution26().solution(left, right);
		System.out.println(answer);

	}
}

class Solution26 {
	public int solution(int left, int right) {
		int answer = 0;
		for (int i = left; i <= right; i++) {// left (13) ~ right(17)까지 반복
			int cnt = 0;

			for (int j = 1; j <= i; j++) {
				if (i % j == 0) { // i가 j의 약수라면 cnt++
					cnt++;
				}
			}
			int num = i;
			if (cnt % 2 != 0) {// cnt가 홀수라면 음수로 변경
				num = i * -1;
			}
			answer += num;  // answer 에 합을 구하여 리턴
		}
		return answer;
	}
}