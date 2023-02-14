package programmers_level0;

public class _a24_자리수더하기 {
	public static void main(String[] arg) {
		// int[] arr = { 1, 2, 3, 4, 5 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution(1234)));
	}

	public static int solution(int n) {
		int answer = 0, length = 0;
		length = (int) (Math.log10(n) + 1);
		for (int i = 0; i < length; i++) {
			answer += n % 10;
			n = n / 10;
		}
		return answer;
	}
}

/*
while(n>0){
answer+=n%10;
n/=10;
}

return answer;
}
*/