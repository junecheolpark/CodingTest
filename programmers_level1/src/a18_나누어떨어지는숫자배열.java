import java.util.Arrays;
import java.util.Scanner;

public class a18_나누어떨어지는숫자배열 {
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
		Arrays.sort(arr); // 오름차순 정렬
		int cnt = 0;
		int cnt2 = 0;

		for (int i = 0; i < arr.length; i++) { // cnt++를 통해 배열 길이값 체크
			if (arr[i] % divisor == 0) {
				cnt++;
			}
		}

		if (cnt < 1) { // cnt 1보다 작다면 -1 리턴
			int[] answer = { -1 };
			return answer;
		} else { 
			int[] answer = new int[cnt];
			for (int i = 0; i < arr.length; i++) { // 같은 방법으로
				if (arr[i] % divisor == 0) {
					answer[cnt2++] = arr[i];
				}
			}
			return answer;
		}
		/**/
		/* 해석하기
		int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
        if(answer.length == 0) answer = new int[] {-1};
        Arrays.sort(answer);
        return answer;
        /**/
	}
}
