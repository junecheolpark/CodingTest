import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class a10_�ϻ���� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		boolean answer = new Solution10().solution(x);
		System.out.println(answer);

	}
}

class Solution10 {
	boolean solution(int x) {
		int sum = 0;
		int num = x; // num�� x�� ����
		while (x != 0) { // x�� 0�̵ɶ����� �ݺ�
			sum += x % 10; // 10���� ���� ������ ���� sum�� ���ϸ� ����
			x /= 10; //x�� 10���� ������ ����
		}
		return num % sum == 0; // ������ ���� 0�̸� true���� ����
	}
}
