import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class a10_하샤드수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		boolean answer = new Solution10().solution(x);
		System.out.println(answer);

	}
}

class Solution10 {
	boolean solution(int x) {
		int sum = 0;
		int num = x; // num은 x로 정의
		while (x != 0) { // x가 0이될때까지 반복
			sum += x % 10; // 10으로 나눈 나머지 값을 sum과 더하며 정의
			x /= 10; //x를 10으로 나눈값 정의
		}
		return num % sum == 0; // 나머지 값이 0이면 true값을 리턴
	}
}
