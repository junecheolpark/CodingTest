import java.util.Arrays;
import java.util.HashSet;

//https://school.programmers.co.kr/learn/courses/30/lessons/68644

public class a45_�ΰ��̾Ƽ����ϱ� {
	public static void main(String[] arg) {
		int[] array = { 2, 1, 3, 4, 1 };
		int[] Array = solution(array);
		for (int i = 0; i < Array.length; i++) {
			System.out.println(Array[i]);
		}

	}

	public static int[] solution(int[] numbers) {
		HashSet<Integer> set = new HashSet<>();
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i; j < numbers.length - 1; j++) { // ���� ������ ���� ���� set�� �����
				set.add(numbers[i] + numbers[j + 1]);
			}
		}
		// size����ŭ ���� �Ͽ� �����
		int[] answer = new int[set.size()];
		int index = 0;
		for (int num : set) {
			answer[index++] = num;
		}
		// �������� ����
		Arrays.sort(answer);
		return answer;
	}
}
