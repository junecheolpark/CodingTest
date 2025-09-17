package programmers_level0;
/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181844
 * */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _a84_�迭�ǿ��һ����ϱ� {
	public static void main(String[] arg) {
		int[] arr = { 293, 1000, 395, 678, 94 };
		int[] arr2 = { 94, 777, 104, 1000, 1, 12 };
//		System.out.println(solution(arr, 3));
		System.out.println(Arrays.toString(solution(arr, arr2)));
	}

	/*
	 * 1���� ���
	 * ���� ������
	 * ���� �־��� ��� 100 �� 100 = 10,000�� �� O(N��M)
	 * */
	
	public static int[] solution(int[] arr, int[] delete_list) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < delete_list.length; j++) {
				if (arr[i] == delete_list[j]) { // arr�� del�� ���ٸ� Ż��
					break;
				}
				if (j == delete_list.length - 1) { // �ݺ��� �������� �����ʴٸ� list�߰�
					if (arr[i] != delete_list[j]) {
						list.add(arr[i]);
						break;
					}
				}
			}
		}
		// ������ ������ �̻��� for���� ������� ����
		return list.stream().mapToInt(Integer::intValue).toArray(); 
	}
	
	// 2��° ��� HashSet ���� �����θ� O(1) ���� ���� ���� Ȯ�� �����ؼ� �ξ� ȿ����
	public static int[] solution2(int[] arr, int[] delete_list) {
		// set�� ��Ƶ�
	    Set<Integer> delSet = new HashSet<>();
	    for (int n : delete_list) {
	        delSet.add(n);
	    }
	    
	    // List�� �����ϴ��� Ȯ��
	    List<Integer> list = new ArrayList<>();
	    for (int n : arr) {
	        if (!delSet.contains(n)) {
	            list.add(n);
	        }
	    }

	    // ������ ������ �̻��� for���� ������� ����
	    return list.stream().mapToInt(Integer::intValue).toArray();
	}
}