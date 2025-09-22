package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181936
 * */

public class _b136_문자열잘라서정렬하기 {
	public static void main(String[] arg) {
		System.out.println(Arrays.toString(solution("xaxbxcx")));
	}

	// 방법1: 반복문, 스트림 없이 순수 정규식 + split + sort만으로 처리
	public static String[] solution(String myString) {
		// 1. 처음과 끝의 x 제거
		myString = myString.replaceAll("^x+|x+$", "").replaceAll("x+", "x");
		// x기준으로 배열
		String[] arr = myString.split("x");
		Arrays.sort(arr);
		return arr;
	}

	// 방법2: 스트림 + 람다식
	public static String[] solution2(String myString) {
		// 1. "x" 기준으로 분리
		String[] arr = myString.split("x");

		// 2. 빈 문자열 제거 및 정렬
		String[] result = Arrays.stream(arr).filter(s -> !s.isEmpty())
                                .sorted()
                                .toArray(String[]::new);
        return result;
	}

}