package programmers_level0;

public class _a32_�빮�ڿͼҹ��� {
	public static void main(String[] arg) {
		// int[] arr = { 1, 2, 3, 4, 5 };
		// String str = "hello";
		// String[] sarr = { "a", "b", "c" };
		System.out.println(String.valueOf((char)65));
		System.out.println((solution("cccCCC")));
		System.out.println((solution("CCCccc")));
	}

	public static String solution(String my_string) {
		StringBuilder sb = new StringBuilder();
		String[] str = my_string.split("");
		for (int i = 0; i < str.length; i++) {
			//�빮�ڶ��
			if(str[i].equals(str[i].toUpperCase())) {
				sb.append(str[i].toLowerCase());
			}else{
				sb.append(str[i].toUpperCase());
			};
			
		}
		return sb.toString();
	}
}