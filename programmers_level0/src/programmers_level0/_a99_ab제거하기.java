package programmers_level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181870
 * */

public class _a99_ab제거하기 {
	public static void main(String[] arg) {
		String[] arr = { "and", "notad", "abcd" };
		System.out.println(Arrays.toString(solution(arr)));
	}

	public static String[] solution(String[] strArr) {
		List<String> result = new ArrayList<>();
		for (String str : strArr) {
			if (!str.contains("ad"))
				result.add(str);
		}
		return result.toArray(new String[0]);
	}
	
	// 방법2
	public static String[] solution2(String[] strArr) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < strArr.length; i++) {
			if (!strArr[i].contains("ad")) {
				if (sb.length() > 0)
					sb.append("-"); // 첫 번째 이후만 "-" 추가
				sb.append(strArr[i]);
			}
		}
		return sb.toString().split("-");
	}

}