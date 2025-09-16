package programmers_level0;

// https://school.programmers.co.kr/learn/courses/30/lessons/181873

public class _a76_주사위게임2 {
	public static void main(String[] arg) {
		System.out.println((solution("programmers", "p")));
	}

	public static String solution(String my_string, String alp) {
		char[] chars = my_string.toCharArray();
        char c = alp.charAt(0);
        for (int i = 0; i< chars.length; i++){
            if(chars[i] == c){
                chars[i] = Character.toUpperCase(c);
            }
        } 
        return String.valueOf(chars);
        // return my_string.replaceAll(alp, alp.toUpperCase());
	}
}