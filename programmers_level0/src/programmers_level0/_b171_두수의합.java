package programmers_level0;

import java.math.BigInteger;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/181846
 * */

public class _b171_두수의합 {
	public static void main(String[] arg) {
		System.out.println((solution("18446744073709551615", "287346502836570928366")));
	}

	/*
	 * int -2,147,483,648 ~ 2,147,483,647 -9,223,372,036,854,775,808 ~
	 * 9,223,372,036,854,775,807 무한 (Infinity) int int_bigNum =
	 * bigNumber.intValue(); //BigIntger -> int long long_bigNum =
	 * bigNumber.longValue(); //BigIntger -> long float float_bigNum =
	 * bigNumber.floatValue(); //BigIntger -> float double double_bigNum =
	 * bigNumber.doubleValue(); //BigIntger -> double String String_bigNum =
	 * bigNumber.toString(); //BigIntger -> String
	 */
	public static String solution(String a, String b) {
		BigInteger bigNum1 = new BigInteger(a);
		BigInteger bigNum2 = new BigInteger(b);
		return bigNum1.add(bigNum2).toString();
	}

}
