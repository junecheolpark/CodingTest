import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class a31_�������ڴ½Ⱦ� {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		int[] answer = new Solution31().solution(arr);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution31 {
	public int[] solution(int[] arr) {
		int[] answer = {};
		ArrayList<Integer> arrList = new ArrayList<>();

		int num = -1; // ���Ұ� 0~9���� �̹Ƿ� ���� �ȹ޴� �ƹ� ����.
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != num) {
				arrList.add(arr[i]);
				num = arr[i];
			}
		}

		answer = new int[arrList.size()]; // answer ����Ʈ ũ�� ����.
		for (int i = 0; i < answer.length; i++) {
			answer[i] = arrList.get(i);
		}

		return answer;
	}
}
