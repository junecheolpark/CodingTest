package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/120871
 * */

public class _b196_저주의숫자3 {
	public static void main(String[] arg) {
		System.out.println((solution(15)));

	}
	// 숫자가 작을경우 방법1
	public static int solution(int n) {
		int cnt = 1, num = 1;
		while (cnt < n) {
			num++;
			if (num % 3 == 0 || String.valueOf(num).contains("3")) {
                continue; // 3의 배수 또는 숫자 3 포함 시 건너뜀
            }
			cnt++; // 유효한 숫자면 카운트 증가
		}
		return num;
	}
	
	// 만약 숫자가 클경우 방법2
	public static int solution2(int n) {
		int count = 0;
        int num = 0;

        while (count < n) {
            num++;
            int temp = num;
            boolean ok = true;
            while (temp > 0) {
                if (temp % 10 == 3) { // 나머지가 3일경우 멈춤
                    ok = false;
                    break;
                }
                temp /= 10; // 나누기 10을하여 3일경우 false (30... 300..)
            }
            if (num % 3 == 0) ok = false;

            if (ok) count++;
        }

        return num;
	}
}
