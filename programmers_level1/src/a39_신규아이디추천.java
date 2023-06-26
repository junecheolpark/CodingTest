//https://school.programmers.co.kr/learn/courses/30/lessons/72410

public class a39_신규아이디추천 {
	public static void main(String[] arg) {
		String answer = new Solution39().solution("abcdefghijklmn.p");
		System.out.println(answer);
	}
}

class Solution39 {

	public String solution(String new_id) {
	    // 1. 소문자 변환
	    String output = new_id.toLowerCase();

	    // 2. 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거
	    output = output.replaceAll("[^a-z0-9-_.]", "");

	    // 3. 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
	    output = output.replaceAll("\\.+", ".");

	    // 4. 마침표(.)가 처음이나 끝에 위치한다면 제거
	    output = output.replaceAll("^\\.|\\.$", "");

	    // 5. 빈 문자열인 경우 "a" 대입
	    if (output.isEmpty()) {
	        output = "a";
	    }

	    // 6. 길이가 16자 이상인 경우
	    if (output.length() >= 16) {
	        output = output.substring(0, 15); // 첫 15개 문자를 제외한 나머지 문자 제거
	        output = output.replaceAll("\\.$", ""); // 마지막 문자가 마침표(.)인 경우 제거
	    }

	    // 7. 길이가 2자 이하인 경우
	    if (output.length() <= 2) {
	        char lastChar = output.charAt(output.length() - 1); // 마지막 문자
	        while (output.length() < 3) {
	            output += lastChar; // 마지막 문자를 끝에 추가
	        }
	    }

	    return output;
	}
}
