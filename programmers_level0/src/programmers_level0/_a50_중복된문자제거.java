package programmers_level0;

import java.util.ArrayList;
import java.util.List;

public class _a50_중복된문자제거 {
	public static void main(String[] arg) {
		// int[] arr2 = { 4, 455, 6, 4, -1, 45, 6 };
		// int[] arr3 = { 1, 2, 3 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println((solution("We are the world")));
		System.out.println((solution("people")));
	}

	public static String solution(String my_string) {
		char[] ch = my_string.toCharArray();
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            if (!arr.contains(String.valueOf(my_string.charAt(i)))) {
                arr.add(String.valueOf(my_string.charAt(i)));
            }
        }
        return String.join("", arr);
    }
}

/*
String[] answer = my_string.split("");
Set<String> set = new LinkedHashSet<String>(Arrays.asList(answer));

return String.join("", set);
*/