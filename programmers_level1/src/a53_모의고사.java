import java.util.ArrayList;
import java.util.List;

//https://school.programmers.co.kr/learn/courses/30/lessons/42840

public class a53_모의고사 {
	public static void main(String[] arg) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr2 = solution(arr);
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}

	public static int[] solution(int[] answers) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] arr3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		int cnt1 = 0, cnt2 = 0, cnt3 = 0;

		for (int i = 0; i < answers.length; i++) {
			if (answers[i % answers.length] == arr1[i % arr1.length]) {cnt1++;}
			if (answers[i % answers.length] == arr2[i % arr2.length]) {cnt2++;}
			if (answers[i % answers.length] == arr3[i % arr3.length]) {cnt3++;}
		}
		int max = maxNumber(cnt1, cnt2, cnt3);
		
		List<Integer> num = new ArrayList<>();
		if (cnt1 >= max) {num.add(1);}
		if (cnt2 >= max) {num.add(2);}
		if (cnt3 >= max) {num.add(3);}

		int[] answer = new int[num.size()];
		
		for (int i = 0; i < num.size(); i++) {
			answer[i] = num.get(i);
		}
		return answer;
	}

	public static int maxNumber(int num1, int num2, int num3) {
		int max = num1;

		if (num2 > max) {max = num2;}
		if (num3 > max) {max = num3;}

		return max;
	}
}
