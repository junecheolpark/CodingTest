package programmers_level0;

public class _a53_���丮�� {
	public static void main(String[] arg) {
		// int[] arr2 = { 4, 455, 6, 4, -1, 45, 6 };
		// int[] arr3 = { 1, 2, 3 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution(3628800)));
		System.out.println((solution(7)));
	}

	public static int solution(int n) {
	       int num = 1, cnt = 1;
			// num�� n���� Ŭ������ �ݺ�
	        if(n <= 1) return 1;
			while (true) {
				num *= cnt;
				if (num > n) {
					break;
				}
				cnt++;
			}
			
			return num == cnt ? cnt : cnt-1;
		}
	}