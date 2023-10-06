package programmers_level2;

import java.util.Stack;

//https://school.programmers.co.kr/learn/courses/30/lessons/12973
public class a06_짝지어제거하기 {
	public static void main(String[] args) {
		System.out.println((way1("accaddaa")));
		System.out.println((way1("baabaa")));
		System.out.println((way1("cdcd")));
	}

	public static int way1(String str) {
		 String[] split = str.split("");
	        Stack<String> stack = new Stack<>();

	        for (String s : split) {
	            if (!stack.isEmpty() && stack.peek().equals(s)) {// 문자열이 비어있지않고 스택 맨위에있는 문자와 같으면 제거
	                stack.pop();
	            } else {
	                stack.push(s); // 문자열 넣기
	            }
	        }

	        return stack.isEmpty() ? 1 : 0;
	}

}
