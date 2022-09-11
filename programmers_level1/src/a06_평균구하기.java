import java.util.Scanner;

public class a06_평균구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 2, 3, 4 };
		double answer = new Solution6().solution(arr);
		System.out.println(answer);

	}

}

class Solution6 {
	public double solution(int[] arr) {
		double answer = 0;
		for (int i = 0; i < arr.length; i++) { // arr배열의 길이값만큼 반복
			answer += arr[i]; // answer에 arr[i]값을 더하며 정의
		}
		answer = answer / arr.length; // answer에 arr길이값만큼 나눠서 정의
		return answer;
	}
}
