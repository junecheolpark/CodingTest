import java.util.Arrays;
import java.util.HashSet;

//https://school.programmers.co.kr/learn/courses/30/lessons/68644

public class a45_두개뽑아서더하기 {
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
			for (int j = i; j < numbers.length - 1; j++) { // 버블 정렬을 통해 값을 set에 담아줌
				set.add(numbers[i] + numbers[j + 1]);
			}
		}
		// size값만큼 선언 하여 담아줌
		int[] answer = new int[set.size()];
		int index = 0;
		for (int num : set) {
			answer[index++] = num;
		}
		// 오름차순 정렬
		Arrays.sort(answer);
		return answer;
	}
}
