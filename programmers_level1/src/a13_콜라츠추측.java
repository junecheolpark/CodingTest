import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class a13_콜라츠추측 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = new Solution13().solution(n);
		System.out.println(answer);

	}
}

class Solution13 {
	public int solution(int num) {
		long n = num; // long타입으로 변환
		int cnt = 0;
		while (n != 1) {
			cnt++;
			if (n % 2 == 0) {// num이 짝수라면 나누기 2
				n /= 2;
			} else { // num이 홀수라면 (곱하기3)+1
				n = (n * 3) + 1;
			}
			if (cnt == 500) { // 작업이 500번 이상이면 -1
				cnt = -1;
				break;
			}
		}

		return cnt;
	}
}
