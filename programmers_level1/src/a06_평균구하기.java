import java.util.Scanner;

public class a06_��ձ��ϱ� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 2, 3, 4 };
		double answer = new Solution6().solution(arr);
		System.out.println(answer);

	}

}

class Solution6 {
	public double solution(int[] arr) {
		double answer = 0;
		for (int i = 0; i < arr.length; i++) { // arr�迭�� ���̰���ŭ �ݺ�
			answer += arr[i]; // answer�� arr[i]���� ���ϸ� ����
		}
		answer = answer / arr.length; // answer�� arr���̰���ŭ ������ ����
		return answer;
	}
}
