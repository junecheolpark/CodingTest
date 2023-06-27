import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/17681

public class a41_비밀지도_2 {
	public static void main(String[] arg) {
		int[] arr = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };
		String[] strArray = solution(5, arr, arr2);
		System.out.println(String.join(",", strArray));
	}

//또다른 정답
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];

		for (int i = 0; i < n; i++) {
			// |는 or 연산자 10110 | 11000 = 11110  &는 and 연산자 10110 | 11000 = 10000 
			int mergedNum = arr1[i] | arr2[i]; // arr1과 arr2를 비트 OR 연산하여 합침
			String binaryString = Integer.toBinaryString(mergedNum); // 2진수로 변환된 문자열
			System.out.println(binaryString);
			binaryString = String.format("%" + n + "s", binaryString); // 자릿수를 맞추기 위해 형식화
			binaryString = binaryString.replace('1', '#').replace('0', ' '); // 1은 #으로, 0은 공백으로 치환
			answer[i] = binaryString;
		}

		return answer;
	}
}
