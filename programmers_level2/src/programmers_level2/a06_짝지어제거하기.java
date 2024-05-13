package programmers_level2;

import java.util.Stack;

//https://school.programmers.co.kr/learn/courses/30/lessons/12973
public class a06_¦���������ϱ� {
	public static void main(String[] args) {
		for(int i = 0; i< 26; i++) {
			System.out.print(",  " + (6*i));
		}
		System.out.println();
		for(int i = 0; i< 26; i++) {
			System.out.print(",  " + (8*i));
		}
		System.out.println();
		for(int i = 0; i< 13; i++) {
			System.out.print(", " + (14*i));
		}
//		System.out.println((way1("accaddaa")));
//		System.out.println((way1("baabaa")));
//		System.out.println((way1("cdcd")));
	}

	public static int way1(String str) {
		 String[] split = str.split("");
	        Stack<String> stack = new Stack<>();

	        for (String s : split) {
	            if (!stack.isEmpty() && stack.peek().equals(s)) {// ���ڿ��� ��������ʰ� ���� �������ִ� ���ڿ� ������ ����
	                stack.pop();
	            } else {
	                stack.push(s); // ���ڿ� �ֱ�
	            }
	        }

	        return stack.isEmpty() ? 1 : 0;
	}

}
