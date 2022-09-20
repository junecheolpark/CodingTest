import java.util.Arrays;
import java.util.Scanner;

public class a30_�ִ��������ּҰ���� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] answer = new Solution30().solution(n, m);
		System.out.println(Arrays.toString(answer));

	}
}

// 3 12
class Solution30 {
	public int[] solution(int n, int m) {

		int[] answer = new int[2];
		// �ִ� ����� (n��m�� ����� ���ϰ� ����� ����߿��� ū�� �����ϴ� ���)
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) { // n�� ������ m�� ��� ���ϴ� �ݺ��� ����
				for (int j = 1; j <= m; j++) {
					if (m % j == 0 && i == j) { // m�� ����϶� answer[0]�� ����� ����
						answer[0] = j;
					}
				}
			}
		}
		// �ּ� ����� (GCD ���)
		int mt = n*m;
		while(m != 0) {
			int r = n % m;	// �������� �����ش�.
			// GCD(a, b) = GCD(b, r)�̹Ƿ� ��ȯ�Ѵ�.
			n = m;		
			m = r;
		}
		answer[1] = mt / n;
		return answer;
	}
}