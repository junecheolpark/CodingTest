package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/120880
 * */

public class _b202_특이한정렬 {
	public static void main(String[] arg) {
		System.out.println(Arrays.toString(solution(new int[] {1,2,3,4,5,6} , 4)));

	}

	private static int[] solution(int[] numlist, int n) {
		// Integer 배열로 변환 (Comparator 사용을 위해)
        Integer[] arr = Arrays.stream(numlist).boxed().toArray(Integer[]::new);
        
        // 커스텀 정렬
        Arrays.sort(arr, (a, b) -> {
            int distA = Math.abs(a - n);
            int distB = Math.abs(b - n);
            
            if (distA == distB) {
                return b - a; // 거리 같으면 큰 수가 먼저
            }
            return distA - distB; // 거리가 가까운 순서
        });
        
        // 다시 int[]로 변환
        return Arrays.stream(arr).mapToInt(Integer::intValue).toArray();
    }
	
}
