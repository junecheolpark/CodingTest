import java.util.Scanner;

public class a02_나머지1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num = new Solution2().solution(n);
		System.out.println(num);

	}

}

class Solution2 {
	public int solution(int n) {
		int x = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 1) { //입력된 n값을 반복문 i로 나눠주어 나머지가 1이되면 멈춤
				x = i;
				break;
			}
		}
		return x;
	}
}