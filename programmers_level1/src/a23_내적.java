import java.util.Scanner;

public class a23_���� {
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
		for (int i = 0; i<a.length; i++) { //�迭 ���� ��ŭ a[i]*b[i] �� ���� answer ���� �����ش�
			answer += a[i]*b[i]; 
		}
		return answer;
	}
}
