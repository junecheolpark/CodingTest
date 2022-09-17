import java.util.Scanner;

public class a23_내적 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = { 1, 2, 3, 4 };
		int[] b = { -3, -1, 0, 2 };
		int answer = new Solution23().solution(a,b);
		System.out.println(answer);

	}
}

class Solution23 {
	public int solution(int[] a, int[] b) {
		int answer = 0;  
		for (int i = 0; i<a.length; i++) { //배열 길이 만큼 a[i]*b[i] 를 곱해 answer 값에 더해준다
			answer += a[i]*b[i]; 
		}
		return answer;
	}
}
