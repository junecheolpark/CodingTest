import java.util.Scanner;

public class a26_����ǰ����͵��� {
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
		for (int i = left; i <= right; i++) {// left (13) ~ right(17)���� �ݺ�
			int cnt = 0;

			for (int j = 1; j <= i; j++) {
				if (i % j == 0) { // i�� j�� ������ cnt++
					cnt++;
				}
			}
			int num = i;
			if (cnt % 2 != 0) {// cnt�� Ȧ����� ������ ����
				num = i * -1;
			}
			answer += num;  // answer �� ���� ���Ͽ� ����
		}
		return answer;
	}
}