import java.util.Scanner;

public class a27_����ǵ��� {
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
		answer = arr1; // answer�� arr1���� ��������
		for (int i = 0; i < arr1.length; i++) { // arr�� ���̰���ŭ �ݺ�
			for (int j = 0; j < arr1[i].length; j++) { // arr�迭�� ���̰���ŭ �ݺ�
				answer[i][j] += arr2[i][j]; // �� ��ġ���� �����ش�
			}
		}
		return answer;
	}
}