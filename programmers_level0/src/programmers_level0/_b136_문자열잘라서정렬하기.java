package programmers_level0;

import java.util.Arrays;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181936
 * */

public class _b136_���ڿ��߶������ϱ� {
	public static void main(String[] arg) {
		System.out.println(Arrays.toString(solution("xaxbxcx")));
	}

	// ���1: �ݺ���, ��Ʈ�� ���� ���� ���Խ� + split + sort������ ó��
	public static String[] solution(String myString) {
		// 1. ó���� ���� x ����
		myString = myString.replaceAll("^x+|x+$", "").replaceAll("x+", "x");
		// x�������� �迭
		String[] arr = myString.split("x");
		Arrays.sort(arr);
		return arr;
	}

	// ���2: ��Ʈ�� + ���ٽ�
	public static String[] solution2(String myString) {
		// 1. "x" �������� �и�
		String[] arr = myString.split("x");

		// 2. �� ���ڿ� ���� �� ����
		String[] result = Arrays.stream(arr).filter(s -> !s.isEmpty())
                                .sorted()
                                .toArray(String[]::new);
        return result;
	}

}