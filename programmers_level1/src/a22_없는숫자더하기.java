import java.util.Scanner;

public class a22_���¼��ڴ��ϱ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = { 1, 2, 3, 4, 6, 7, 8, 0 };
		int answer = new Solution22().solution(numbers);
		System.out.println(answer);

	}
}

class Solution22 {
	public int solution(int[] numbers) {
		int answer = 45; // 0~9�� ��
		for (int i = 0; i < numbers.length; i++) { // numbers �迭�� ���� ����
			answer -= numbers[i];
		}
		return answer;
	}
}
