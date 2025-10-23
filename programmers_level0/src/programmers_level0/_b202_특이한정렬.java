package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/120880
 * */

public class _b202_Ư�������� {
	public static void main(String[] arg) {
		System.out.println(Arrays.toString(solution(new int[] {1,2,3,4,5,6} , 4)));

	}

	private static int[] solution(int[] numlist, int n) {
		// Integer �迭�� ��ȯ (Comparator ����� ����)
        Integer[] arr = Arrays.stream(numlist).boxed().toArray(Integer[]::new);
        
        // Ŀ���� ����
        Arrays.sort(arr, (a, b) -> {
            int distA = Math.abs(a - n);
            int distB = Math.abs(b - n);
            
            if (distA == distB) {
                return b - a; // �Ÿ� ������ ū ���� ����
            }
            return distA - distB; // �Ÿ��� ����� ����
        });
        
        // �ٽ� int[]�� ��ȯ
        return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
    }
	
}
