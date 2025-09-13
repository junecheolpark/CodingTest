package programmers_level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/181906

public class _a69_���λ�����Ȯ���ϱ� {
	public static void main(String[] arg) {
		String myString = "banana";
		String isPrefix= "nan";
		
		System.out.println((solution(myString, isPrefix)));
	}

	// �迭�� ��ȯ�� Ȯ��
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

	//Ư�� ���λ�(prefix) �� �����ϴ��� Ȯ��
	public static int solution2(String my_string, String is_prefix) {
		return my_string.startsWith(is_prefix) ? 1 : 0;
	}
	
}