import java.util.Scanner;

public class a03_�ڸ������ϱ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//int answer = new Solution3().solution(n);
		int answer = new Solution3_1().solution(n);
		System.out.println(answer);

	}

}

class Solution3 {
	public int solution(int n) {
		int answer = 0;
		while(n!=0) {// n �� 0�� �ƴ϶��
			answer += n%10; //1���ڸ����� ���� ������
			n /= 10; // 10�� ������
			System.out.println(answer);
		}
		return answer;
	}
}
class Solution3_1 {
	public int solution(int n) {
		int answer = 0;
		while(n!=0) {// n �� 0�� �ƴ϶��
			answer += n%10; //1���ڸ����� ���� ������
			n /= 10; // 10�� ������
			System.out.println(answer);
		}
		return answer;
	}
}