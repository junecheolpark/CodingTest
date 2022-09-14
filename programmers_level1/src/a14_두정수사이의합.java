import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class a14_두정수사이의합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		long answer = new Solution14().solution(a, b);
		System.out.println(answer);

	}
}

class Solution14 {
	public long solution(int a, int b) {
		long answer = 0;
		for ( int i = Math.min(a, b); i<=Math.max(a, b); i++) {
			answer += i;
		}
		/*
		if (a < b) {
			for (int i = a; i <= b; i++) { // a보다 b가 클경우 a~b만큼 반복
				answer += i;
			}
		} else if (a > b){
			for (int i = b; i <= a; i++) { // b보다 a가 클경우 b~a만큼 반복
				answer += i;
			}
		}else { // a와 b가 같다면 a 정의
			answer = a;
		}
		*/
		return answer;
	}
}
