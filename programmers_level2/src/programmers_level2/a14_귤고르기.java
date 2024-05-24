package programmers_level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://school.programmers.co.kr/learn/courses/30/lessons/138476
public class a14_귤고르기 {
	public static void main(String[] args) {

		int[] tang = {1, 3, 2, 5, 4, 5, 2, 3}; 
		System.out.println(solution(6,tang)); // 출력:3
	}

	public static int solution(int k, int[] tangerine) {
		 Map<Integer, Integer> countMap = new HashMap<>();
	        for (int size : tangerine) {
	            countMap.put(size, countMap.getOrDefault(size, 0) + 1);
	        }

	        // 개수를 배열로 변환하고 내림차순으로 정렬한다
	        Integer[] counts = countMap.values().toArray(new Integer[0]);
	        Arrays.sort(counts, (a, b) -> b - a);

	        int selected = 0;
	        int varieties = 0;

	        // 가장 많은 종류의 귤부터 선택하여 k개를 채운다
	        for (int cnt : counts) {
	            selected += cnt;
	            varieties++;
	            if (selected >= k) {
	                break;
	            }
	        }

	        return varieties;
	    }

}
