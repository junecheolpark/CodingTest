import java.util.Arrays;
import java.util.Scanner;

public class a12_x만큼간격이있는n개의숫자 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		long[] answer = new Solution12().solution(x, n);
		System.out.println(Arrays.toString(answer));
		/*/
		for(long nn : answer) {
			System.out.println("n"+nn);
		}
		/**/

	}
}

class Solution12 {
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		long num = 0;
		for (int i = 0; i < n; i++) { // n의 값만큼 반복
			num += x; // num에 +x값만큼 정의
			answer[i] = num; //answer[i]에 num 정의
		}
		
		return answer;
		
	}
}
