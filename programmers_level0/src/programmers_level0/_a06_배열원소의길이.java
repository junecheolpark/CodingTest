package programmers_level0;

import java.util.Arrays;
import java.util.Scanner;

public class _a06_배열원소의길이 {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		String[] s = {"We", "are", "the", "world!"};
		System.out.println(Arrays.toString(solution1(s)));
	}

	public static int[] solution1(String[] strlist) {
		int[] answer = new int[strlist.length];
        for(int i = 0; i< strlist.length ; i++){
            answer[i] = strlist[i].length();
        }
        return answer;
	}
}
