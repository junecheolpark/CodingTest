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
			for (int j = i; j < numbers.length - 1; j++) {
//				System.out.print(j + " : " + (numbers[j] + numbers[j + 1]) + ", ");
				set.add(numbers[i] + numbers[j + 1]);
			}
//			System.out.println();
		}
		int[] answer = new int[set.size()];
		int index = 0;
		for (int num : set) {
			answer[index++] = num;
		}
		return answer;
	}
}
