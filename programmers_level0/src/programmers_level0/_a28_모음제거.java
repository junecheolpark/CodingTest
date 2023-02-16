package programmers_level0;

public class _a28_모음제거 {
	public static void main(String[] arg) {
		// int[] arr = { 1, 2, 3, 4, 5 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution("bus")));
		System.out.println((solution("nice to meet you")));
	}

	public static String solution(String my_string) {
        String[] rep = {"a", "e", "i", "o", "u"}; 
        for(int i =0; i< rep.length; i++) {
        	my_string = my_string.replace(rep[i], "");
        }
        return my_string;
    }
}

// return my_string.replace("[aeiou]", "");

