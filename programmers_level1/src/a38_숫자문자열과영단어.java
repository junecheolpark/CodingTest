// https://school.programmers.co.kr/learn/courses/30/lessons/86491
public class a38_���ڹ��ڿ������ܾ� {
	public static void main(String[] arg) {
		int answer = new Solution38().solution("one4seveneight");
		System.out.println(answer);
	}
}

class Solution38 {

	public int solution(String s) {
		String[] strArr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i = 0; i < strArr.length; i++) {
            s = s.replaceAll(strArr[i], Integer.toString(i));
        }
        return Integer.parseInt(s);
	}
}
