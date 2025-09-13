package programmers_level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/181906

public class _a69_접두사인지확인하기 {
	public static void main(String[] arg) {
		String myString = "banana";
		String isPrefix= "nan";
		
		System.out.println((solution(myString, isPrefix)));
	}

	// 배열로 변환후 확인
	public static int solution(String my_string, String is_prefix) {
		int answer = 1;
		char[] arr1 = my_string.toCharArray();
		char[] arr2 = is_prefix.toCharArray();
		
		if (arr1.length < arr2.length) {
			return 0;
		}

		for (int i = 0; i < arr2.length; i++) {
			if (arr1[i] != arr2[i]) {
				answer = 0;
			}
		}

		return answer;
	}

	//특정 접두사(prefix) 로 시작하는지 확인
	public static int solution2(String my_string, String is_prefix) {
		return my_string.startsWith(is_prefix) ? 1 : 0;
	}
	
}