import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/17681

public class a41_�������_2 {
	public static void main(String[] arg) {
		int[] arr = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };
		String[] strArray = solution(5, arr, arr2);
		System.out.println(String.join(",", strArray));
	}

//�Ǵٸ� ����
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];

		for (int i = 0; i < n; i++) {
			// |�� or ������ 10110 | 11000 = 11110  &�� and ������ 10110 | 11000 = 10000 
			int mergedNum = arr1[i] | arr2[i]; // arr1�� arr2�� ��Ʈ OR �����Ͽ� ��ħ
			String binaryString = Integer.toBinaryString(mergedNum); // 2������ ��ȯ�� ���ڿ�
			System.out.println(binaryString);
			binaryString = String.format("%" + n + "s", binaryString); // �ڸ����� ���߱� ���� ����ȭ
			binaryString = binaryString.replace('1', '#').replace('0', ' '); // 1�� #����, 0�� �������� ġȯ
			answer[i] = binaryString;
		}

		return answer;
	}
}
