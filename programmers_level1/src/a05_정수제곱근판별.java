import java.util.Scanner;

public class a05_�����������Ǻ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long answer = new Solution5().solution(n);
		System.out.println(answer);

	}

}

class Solution5 {
	public long solution(int n) {
		long answer = -1; //���������� �ƴϸ� -1
		for (long i = 1; i <= n; i++) {//1~n���� �ݺ�
			if (i * i == n) {
				answer = (i+1)*(i+1); // i*i==n �ϰ�� i+1�� ����
			}
		}
		return answer;
	}
}
