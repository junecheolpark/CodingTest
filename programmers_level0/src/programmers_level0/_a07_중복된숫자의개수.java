package programmers_level0;

public class _a07_�ߺ��ȼ����ǰ��� {
	public static void main(String[] arg) {
		int[] arr = {1, 1, 2, 3, 4, 5};
		System.out.println(solution1(arr,1));
	}

	public static int solution1(int[] array, int n) {
		 int answer = 0;
	        for(int a : array){
	            if (a == n) answer++;
	        }
	        return answer;
	    }
}
