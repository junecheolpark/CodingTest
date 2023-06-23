package programmers_level0;

//https://school.programmers.co.kr/learn/courses/30/lessons/181928
public class _a67_이어붙인수 {
	public static void main(String[] arg) {
		int[] arr1 = { 3, 4, 5, 2, 1 };
		System.out.println((solution(arr1)));
	}

	public static int solution(int[] num_list) {
		String evenNum = "";
		String oddNum = "";
		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] % 2 == 0) {
				evenNum += num_list[i];
			} else {
				oddNum += num_list[i];
			}
		}
		return Integer.parseInt(evenNum) + Integer.parseInt(oddNum);
	}
}