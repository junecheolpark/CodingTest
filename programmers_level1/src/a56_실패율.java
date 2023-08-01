import java.util.Arrays;
import java.util.Comparator;

//https://school.programmers.co.kr/learn/courses/30/lessons/42889

public class a56_실패율 {
	public static void main(String[] arg) {
		int[] arr = { 2, 1, 2, 6, 2, 4, 3, 3 };
		int[] arr2 = { 4, 4, 4, 4, 4 };
//		int[] answer = solution(5, arr);
		int[] answer2 = solution(4, arr2);
		for (int i = 0; i < answer2.length; i++) {
			System.out.println(answer2[i]);
		}
	}

	public static int[] solution(int N, int[] stages) {
		int[] answer = new int[N];
		float[] ratio = new float[N];
		int clearStages = stages.length; // 8

		Arrays.sort(stages);
		for (int i = 0; i < stages.length; i++) { // 현재 진행중인 스테이지 수 체크
			if (stages[i] <= N) {
				answer[stages[i] - 1]++;
			}
		}
		for (int i = 0; i < N; i++) { // 클리어하지 못한 비율 구하기
			ratio[i] = (float) answer[i] / clearStages;
			clearStages -= answer[i];
			answer[i] = i + 1;
//			System.out.println((i + 1) + "스테이지 클리어 :" + ratio[i]);
		}

		// 실패율에 따라 스테이지 정렬
		// 람다식

		Integer[] stageIndices = new Integer[N];
		for (int i = 0; i < N; i++) {
			stageIndices[i] = i;
		}
		Arrays.sort(stageIndices, Comparator.comparingDouble(i -> -ratio[i]));

		for (int i = 0; i < N; i++) {
			answer[i] = stageIndices[i] + 1;
		}
		
		/*
		int Num = 0;
		float fNum = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 1; j < N - i; j++) {
				if (ratio[j - 1] < ratio[j]) {
					fNum = ratio[j - 1];
					ratio[j - 1] = ratio[j];
					ratio[j] = fNum;

					Num = answer[j - 1];
					answer[j - 1] = answer[j];
					answer[j] = Num;
				}
			}
		}
		*/

		return answer;
	}
}
