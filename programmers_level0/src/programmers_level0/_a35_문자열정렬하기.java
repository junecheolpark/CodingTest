package programmers_level0;

import java.util.ArrayList;
import java.util.Arrays;

public class _a35_문자열정렬하기 {
	public static void main(String[] arg) {
		// int[] arr = { 1, 2, 3, 4, 5 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution("hi12392")));
		System.out.println((solution("p2o4i8gj2")));
	}

	public static int[] solution(String my_string) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < my_string.length(); i++) {
			if (Character.isDigit(my_string.charAt(i))) {
				list.add((int) my_string.charAt(i)-'0');
			}
		}
		System.out.println(list);
		int[] arr1 = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			arr1[i] = list.get(i).intValue();
		}
		Arrays.sort(arr1);
		return arr1;
	}
}
//정규형도가능
/*
my_string = my_string.replaceAll("[a-z]","");

        int[] answer = new int[my_string.length()];

        for(int i =0; i<my_string.length(); i++){
            answer[i] = my_string.charAt(i) - '0';
        }

        Arrays.sort(answer);

        return answer;
*/