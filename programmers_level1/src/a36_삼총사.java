// https://school.programmers.co.kr/learn/courses/30/lessons/131705
public class a36_삼총사 {
	public static void main(String[] arg) {
		int[] n = {-2, 3, 0, 2, -5};

		int answer = new Solution36().solution(n);
		System.out.println(answer);
	}
}

class Solution36 {
	private int count = 0;

	public int solution(int[] number) {
		backtrack(0, 0, number, 0);
		return count;
	}

	private void backtrack(int currSum, int selected, int[] numbers, int idx) {
		if (selected == 3) { // 세 학생을 선택했을 때
			if (currSum == 0) { // 합이 0이면 삼총사의 방법으로 인정
				count++;
			}
			return;
		}

		if (idx >= numbers.length) {
			return;
		}

		// 현재 학생 선택
		backtrack(currSum + numbers[idx], selected + 1, numbers, idx + 1);

		// 현재 학생 선택하지 않음
		backtrack(currSum, selected, numbers, idx + 1);
	}
}
