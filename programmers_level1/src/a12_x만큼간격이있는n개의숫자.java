import java.util.Arrays;
import java.util.Scanner;

public class a12_x��ŭ�������ִ�n���Ǽ��� {
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
		for (int i = 0; i < n; i++) { // n�� ����ŭ �ݺ�
			num += x; // num�� +x����ŭ ����
			answer[i] = num; //answer[i]�� num ����
		}
		
		return answer;
		
	}
}
