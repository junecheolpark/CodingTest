package programmers_level2;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/70129
public class a03_이진변환반복하기 {
	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(solution("110010101001")));
	}

	public static int[] solution(String s) {
        int[] answer = {};
        int cnt = 0;
        int zeroCnt = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
            	zeroCnt++;
            }
        }
        System.out.println(zeroCnt);
        
        System.out.println(s.replaceAll("0", ""));
        return answer;
    }

}
/*
String binaryString = "1101"; // 2진수
int decimal = Integer.parseInt(binaryString, 2); // 2진수를 10진수로 변환
int decimalNumber = 13; // 10진수
String binaryString = Integer.toBinaryString(decimalNumber); // 10진수를 2진수로 변환
*/
