package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ramda {
	public static void main(String[] args) {
		// Runnable 인터페이스를 구현하는 람다식
		Runnable r = () -> System.out.println("Hello, world!");
		// 메서드 레퍼런스(Method Reference): 기존에 정의된 메서드를 람다식으로 사용할 수 있습니다.
		
		/**/
		// 정적 메서드 레퍼런스
		Function<String, Integer> parseInt = Integer::parseInt;
		/**/
		
		/**/
		// 인스턴스 메서드 레퍼런스
		List<String> list = Arrays.asList("apple", "banana", "orange");
		list.forEach(System.out::println);
		// 생성자 레퍼런스(Constructor Reference): 기존에 정의된 생성자를 람다식으로 사용할 수 있습니다.
		/**/
		
		/**/
		// 생성자 레퍼런스
		Supplier<List<String>> listSupplier = ArrayList::new;
		/**/
		
		/**/
		/*
		 * 1. fruits 리스트 생성
		 * 2. 리스트를 stream(람다식으로 처리할 수 있는 반복자)으로 변환
		 * 3. filter 메서드를 사용해 원하는 요소만 걸러냄
		 * 4. collect  메서드를 사용하여 스트림에서 걸러진 리스트 수집.
		 */
		List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
		List<String> result = fruits.stream().filter(fruit -> fruit.startsWith("a")).collect(Collectors.toList());
		result.forEach(System.out::println);
		/**/
	}
	
	// 함수형 인터페이스 활용: 자바에서는 함수형 인터페이스를 직접 정의하여 람다식을 활용할 수 있습니다.
		@FunctionalInterface interface MyFunction{int operation(int a,int b);}

		// 함수형 인터페이스를 이용한 람다식 사용
		MyFunction add = (a, b) -> a + b;
}