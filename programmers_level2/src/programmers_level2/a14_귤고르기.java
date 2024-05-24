package programmers_level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://school.programmers.co.kr/learn/courses/30/lessons/138476
public class a14_�ְ��� {
	public static void main(String[] args) {

		int[] tang = {1, 3, 2, 5, 4, 5, 2, 3}; 
		System.out.println(solution(6,tang)); // ���:3
	}

	public static int solution(int k, int[] tangerine) {
		 Map<Integer, Integer> countMap = new HashMap<>();
	        for (int size : tangerine) {
	            countMap.put(size, countMap.getOrDefault(size, 0) + 1);
	        }

	        // ������ �迭�� ��ȯ�ϰ� ������������ �����Ѵ�
	        Integer[] counts = countMap.values().toArray(new Integer[0]);
	        Arrays.sort(counts, (a, b) -> b - a);

	        int selected = 0;
	        int varieties = 0;

	        // ���� ���� ������ �ֺ��� �����Ͽ� k���� ä���
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
