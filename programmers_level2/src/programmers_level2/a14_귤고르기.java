package programmers_level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://school.programmers.co.kr/learn/courses/30/lessons/12980
public class a14_�ְ��� {
	public static void main(String[] args) {

		int[] tang = {1, 3, 2, 5, 4, 5, 2, 3}; 
		System.out.println(solution(6,tang)); // ���:3
	}

	public static int solution(int k, int[] tangerine) {
		int answer = 0;
		int kCnt = 0;
		Map<Integer, Integer> map = new HashMap<>();
		// getOrDefault Ű�� ������ �����Ȱ� ��ȯ
		for (int num : tangerine) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		int[] list = new int[map.size()];
		int index = 0;
		for (Integer key : map.keySet()) {
			Integer value = map.get(key);
			System.out.println("Key: " + key + ", Value: " + value);
			list[index] = value;
			index++;
		}
		Arrays.sort(list);
		System.out.println(Arrays.toString(list));
		for (int i = list.length - 1; i >= 0; i--) {
			System.out.println(list[i]);
			kCnt += list[i];
		}
		return answer;
	}

}
