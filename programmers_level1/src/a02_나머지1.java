import java.util.Scanner;

public class a02_������1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = new Solution2().solution(n);
		System.out.println(num);

	}

}

class Solution2 {
	public int solution(int n) {
		int x = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 1) { //�Էµ� n���� �ݺ��� i�� �����־� �������� 1�̵Ǹ� ����
				x = i;
				break;
			}
		}
		return x;
	}
}