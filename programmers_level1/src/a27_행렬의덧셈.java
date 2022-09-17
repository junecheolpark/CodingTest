import java.util.Scanner;

public class a27_행렬의덧셈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr1 = { { 1, 2 }, { 2, 3 } };
		int[][] arr2 = { { 4, 6 }, { 7, 9 } };
		int answer[][] = new Solution27().solution(arr1, arr2);
		System.out.println(answer);

	}
}

class Solution27 {
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = {};
		answer = arr1; // answer를 arr1으로 선언해줌
		for (int i = 0; i < arr1.length; i++) { // arr의 길이값만큼 반복
			for (int j = 0; j < arr1[i].length; j++) { // arr배열의 길이값만큼 반복
				answer[i][j] += arr2[i][j]; // 각 위치마다 더해준다
			}
		}
		return answer;
	}
}