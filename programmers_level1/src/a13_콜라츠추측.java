import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class a13_�ݶ������� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = new Solution13().solution(n);
		System.out.println(answer);

	}
}

class Solution13 {
	public int solution(int num) {
		long n = num; // longŸ������ ��ȯ
		int cnt = 0;
		while (n != 1) {
			cnt++;
			if (n % 2 == 0) {// num�� ¦����� ������ 2
				n /= 2;
			} else { // num�� Ȧ����� (���ϱ�3)+1
				n = (n * 3) + 1;
			}
			if (cnt == 500) { // �۾��� 500�� �̻��̸� -1
				cnt = -1;
				break;
			}
		}

		return cnt;
	}
}
