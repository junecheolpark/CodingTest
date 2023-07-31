//https://school.programmers.co.kr/learn/courses/30/lessons/12977

public class a54_소수만들기 {
	public static void main(String[] arg) {
		int[] arr = { 1, 2, 3, 4 };
		int[] arr2 = { 1, 2, 7, 6, 4 };
		System.out.println(solution(arr2));

	}

	public static boolean minority(int number) {
	    for(int i = 2; i <= number/2; i++) {
	        if(number % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public static int solution(int[] nums) {
		int length = nums.length;
		int cnt = 0;

		for (int i = 0; i < length - 2; i++) {
			for (int j = i + 1; j < length - 1; j++) {
				for (int k = j + 1; k < length; k++) {
					if (minority(nums[i] + nums[j] + nums[k]))
						cnt++;
				}
			}
		}

		return cnt;
	}
}
