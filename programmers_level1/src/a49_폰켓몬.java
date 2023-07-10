import java.util.HashSet;
import java.util.Set;

//https://school.programmers.co.kr/learn/courses/30/lessons/1845

public class a49_ÆùÄÏ¸ó {
	public static void main(String[] arg) {
		int[] arr = { 3, 1, 2, 3 };
		int[] arr2 = { 3, 3, 3, 2, 2, 4 };
		int[] arr3 = { 3, 3, 3, 2, 2, 2 };
		System.out.println(solution(arr));
		System.out.println(solution(arr2));
		System.out.println(solution(arr3));
	}

	public static int solution(int[] nums) {
		Set<Integer> set = new HashSet<>();
		int nLength = nums.length;
		for (int i = 0; i < nLength; i++) {
			set.add(nums[i]);
		}
		return (nLength / 2) <= set.size() ? (nLength / 2) : set.size();
	}
}
