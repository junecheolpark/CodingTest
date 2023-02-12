package programmers_level0;

import java.util.Arrays;

public class _a12_삼각형의완성조건 {
	public static void main(String[] arg) {
		int[] arr = { 199, 72, 222 };
		// String str = "hello";
		System.out.println((solution(arr)));
	}

	public static int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        
        return (sides[0]+sides[1]) > sides[2] ? 1:2;
    }
}
