package programmers_level0;

public class _a11_������ġ���ϱ� {
	public static void main(String[] arg) {
		int[] arr = { 2, 4 };
		// String str = "hello";
		System.out.println((solution(arr)));
	}

	public static int solution(int[] dot) {
		 if (dot[0] > 0) return (dot[1] > 0) ? 1 : 4;
	        else return (dot[1] > 0) ? 2 : 3;
	}
}
