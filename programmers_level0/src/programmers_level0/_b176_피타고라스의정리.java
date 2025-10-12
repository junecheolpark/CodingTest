package programmers_level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/250132
 * */

public class _b176_피타고라스의정리 {
	public static void main(String[] arg) {

	        int a = 3;
	        int c = 5;

	        //int b_square = (int) (Math.pow(c, 2) - Math.pow(a, 2));
	        int b_square = c * c - a * a;

	        System.out.println(b_square);
	}

}
