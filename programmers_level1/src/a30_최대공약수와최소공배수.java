import java.util.Arrays;
import java.util.Scanner;

public class a30_최대공약수와최소공배수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] answer = new Solution30().solution(n, m);
		System.out.println(Arrays.toString(answer));

	}
}

// 3 12
class Solution30 {
	public int[] solution(int n, int m) {

		int[] answer = new int[2];
		// 최대 공약수 (n과m의 약수를 구하고 공통된 약수중에서 큰수 저장하는 방식)
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) { // n의 약수라면 m의 약수 구하는 반복문 실행
				for (int j = 1; j <= m; j++) {
					if (m % j == 0 && i == j) { // m의 약수일때 answer[0]에 약수값 정의
						answer[0] = j;
					}
				}
			}
		}
		// 최소 공배수 (GCD 방식)
		int mt = n*m;
		while(m != 0) {
			int r = n % m;	// 나머지를 구해준다.
			// GCD(a, b) = GCD(b, r)이므로 변환한다.
			n = m;		
			m = r;
		}
		answer[1] = mt / n;
		return answer;
	}
}