import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/138477

public class a50_명예의전당 {
	public static void main(String[] arg) {
		int[] arr = { 10, 100, 20, 150, 1, 100, 200 };
		int[] arr2 = { 0, 300, 40, 300, 20, 70, 150, 50, 500, 1000 };
		int[] Array = solution(3, arr);
		for (int i = 0; i < Array.length; i++) {
			System.out.println(Array[i]);
		}
	}

	public static int[] solution(int k, int[] score) {
		int[] kArr = new int[k];
		int[] answer = new int[score.length];
		int mNum = 0;

		for (int i = 0; i < score.length; i++) {
			
			if (i < k) { // k수 전에는 전부 배열등록
				kArr[i] = score[i];
				for (int j = i; j > 0; j--) { // j-1배열과 비교해 작으면 바꿈
					if (kArr[j - 1] > kArr[j]) {
						mNum = kArr[j];
						kArr[j] = kArr[j - 1];
						kArr[j - 1] = mNum;
					}
				}
			} else {
				if (score[i] > kArr[0]) {
					kArr[0] = score[i];
					Arrays.sort(kArr);
				}
			}
			answer[i] = kArr[0];
		}
		return answer;
	}
}
