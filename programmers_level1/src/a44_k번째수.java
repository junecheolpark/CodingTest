import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/42748

public class a44_k번째수 {
	public static void main(String[] arg) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		int[] Array = solution2(array, commands);
		for (int i = 0; i < Array.length; i++) {
//			System.out.println(Array[i]);
		}

	}

	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
			// 배열 자르기
			int[] slicedArr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
			// 배열 정렬
			Arrays.sort(slicedArr);
			answer[i] = slicedArr[commands[i][2] - 1];
		}
		return answer;
	}

	public static int[] solution2(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {// 문자열 자르기
			StringBuilder sb = new StringBuilder();
			int num1 = commands[i][0] - 1;
			int num2 = commands[i][1] - 1;
			int num3 = commands[i][2] - 1;

			for (int j = 0; j < array.length; j++) {
				if (j >= commands[i][0] - 1 && j < commands[i][1]) {
					sb.append(array[j]);
				}
			}
			char[] arr = sb.toString().toCharArray();
			// 문자 배열 정렬
			Arrays.sort(arr);
			// 배열에 num3 저장
			answer[i] = Character.getNumericValue(arr[num3]);
		}

		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
		return answer;
	}
}
