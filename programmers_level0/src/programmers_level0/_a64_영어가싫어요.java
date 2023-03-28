package programmers_level0;

import java.util.Arrays;

public class _a64_영어가싫어요 {
	public static void main(String[] arg) {
		// int[] arr1 = { 1, 2, 3, 4 };
		System.out.println((solution("onetwothreefourfivesixseveneightnine")));
	}

	public static long solution(String numbers) {
		String[] numbers_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < numbers_arr.length; i++) {
            numbers = numbers.replace(numbers_arr[i], String.valueOf(i));
        }

        return Long.parseLong(numbers);
	}
}