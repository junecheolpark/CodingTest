import java.util.Scanner;

public class a28_�����ѱݾװ���ϱ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		int money = sc.nextInt();
		int count = sc.nextInt();
		long answer = new Solution28().solution(price, money, count);
		System.out.println(answer);

	}
}
// 3 20 4
class Solution28 {
	public long solution(int price, int money, int count) {
		long answer = 0;
		long sum = 0;
		for (int i = 1; i <= count; i++) { // count ��ŭ ��� ������ ������ sum�� ���ϸ� ��������
			sum += price * i;
		}
		answer = (money-sum); // answer �� �������ִ� money���� sum���� ����
		
		return answer < 0 ? -answer : 0; // answer���� 0���� ������ -answer�� �ƴϸ� 0����ȯ
	}
}