import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class a14_�������������� {
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
			for (int i = a; i <= b; i++) { // a���� b�� Ŭ��� a~b��ŭ �ݺ�
				answer += i;
			}
		} else if (a > b){
			for (int i = b; i <= a; i++) { // b���� a�� Ŭ��� b~a��ŭ �ݺ�
				answer += i;
			}
		}else { // a�� b�� ���ٸ� a ����
			answer = a;
		}
		*/
		return answer;
	}
}
