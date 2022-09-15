import java.util.Arrays;
import java.util.Scanner;

public class a18_����������¼��ڹ迭 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 5, 9, 7, 10 };
		int divisor = sc.nextInt();
		int[] answer = new Solution18().solution(arr, divisor);
		System.out.println(Arrays.toString(answer));

	}
}

class Solution18 {
	public int[] solution(int[] arr, int divisor) {
		/**/
		Arrays.sort(arr); // �������� ����
		int cnt = 0;
		int cnt2 = 0;

		for (int i = 0; i < arr.length; i++) { // cnt++�� ���� �迭 ���̰� üũ
			if (arr[i] % divisor == 0) {
				cnt++;
			}
		}

		if (cnt < 1) { // cnt 1���� �۴ٸ� -1 ����
			int[] answer = { -1 };
			return answer;
		} else { 
			int[] answer = new int[cnt];
			for (int i = 0; i < arr.length; i++) { // ���� �������
				if (arr[i] % divisor == 0) {
					answer[cnt2++] = arr[i];
				}
			}
			return answer;
		}
		/**/
		/* �ؼ��ϱ�
		int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
        if(answer.length == 0) answer = new int[] {-1};
        Arrays.sort(answer);
        return answer;
        /**/
	}
}
