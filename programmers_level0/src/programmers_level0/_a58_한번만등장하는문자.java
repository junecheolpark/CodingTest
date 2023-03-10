package programmers_level0;

import java.util.Arrays;

public class _a58_한번만등장하는문자 {
	public static void main(String[] arg) {
		// int[] arr2 = { 4, 455, 6, 4, -1, 45, 6 };
		// int[] arr1 = { 3, 76, 24 };
		// int[] arr2 = { 1, 2, 3, 4, 5, 6, 7 };
		// int[] arr3 = { 30, 10, 23, 6, 100 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution("abcabcadc")));
		System.out.println((solution("abdc")));
		System.out.println((solution("hello")));
	}

	public static String solution(String s) {
		StringBuilder sb = new StringBuilder();
		if(s.length() == 1) return s;
		char[] arr = s.toCharArray();
		int cnt = 0;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) { // 마지막 인덱스라면 그전과 비교
				cnt = arr[i] == arr[i - 1] ? +1 : +0;
				if (cnt == 0) sb.append(arr[i]);
			} else { // 0~ 마지막인덱스 전 -> cnt가 0이면 중복x 
				if (arr[i] == arr[i + 1]) {
					cnt++;
					continue;
				} else {
					if (cnt == 0) sb.append(arr[i]);
					cnt = 0;
				}
			}
		}
		return sb.toString();
	}
}

/*
int[] alpha = new int[26]; // a~z
for(char c : s.toCharArray()){
    alpha[c - 'a']++;
}

StringBuilder answer = new StringBuilder();
for(int i = 0; i < 26; i++){
    if(alpha[i] == 1){
        answer.append((char)(i + 'a'));
    }
}
return answer.toString();
}
}
*/