package programmers_level0;
/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181844
 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _a84_배열의원소삭제하기 {
	public static void main(String[] arg) {
		int[] arr = { 293, 1000, 395, 678, 94 };
		int[] arr2 = { 94, 777, 104, 1000, 1, 12 };
//		System.out.println(solution(arr, 3));
		System.out.println(Arrays.toString(solution(arr, arr2)));
	}

	/*
	 * 1번쨰 방법
	 * 장점 직관적
	 * 단점 최악의 경우 100 × 100 = 10,000번 비교 O(N×M)
	 * */
	
	public static int[] solution(int[] arr, int[] delete_list) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < delete_list.length; j++) {
				if (arr[i] == delete_list[j]) { // arr과 del이 같다면 탈출
					break;
				}
				if (j == delete_list.length - 1) { // 반복문 끝에서도 같지않다면 list추가
					if (arr[i] != delete_list[j]) {
						list.add(arr[i]);
						break;
					}
				}
			}
		}
		// 데이터 만단위 이상은 for문이 눈에띄게 빠름
		return list.stream().mapToInt(Integer::intValue).toArray(); 
	}
	
	// 2번째 방법 HashSet 으로 만들어두면 O(1) 만에 포함 여부 확인 가능해서 훨씬 효율적
	public static int[] solution2(int[] arr, int[] delete_list) {
		// set에 담아둠
	    Set<Integer> delSet = new HashSet<>();
	    for (int n : delete_list) {
	        delSet.add(n);
	    }
	    
	    // List에 존재하는지 확인
	    List<Integer> list = new ArrayList<>();
	    for (int n : arr) {
	        if (!delSet.contains(n)) {
	            list.add(n);
	        }
	    }

	    // 데이터 만단위 이상은 for문이 눈에띄게 빠름
	    return list.stream().mapToInt(Integer::intValue).toArray();
	}
}