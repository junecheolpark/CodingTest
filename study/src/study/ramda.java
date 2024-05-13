package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ramda {
	public static void main(String[] args) {
		// Runnable �������̽��� �����ϴ� ���ٽ�
		Runnable r = () -> System.out.println("Hello, world!");
		// �޼��� ���۷���(Method Reference): ������ ���ǵ� �޼��带 ���ٽ����� ����� �� �ֽ��ϴ�.
		
		/**/
		// ���� �޼��� ���۷���
		Function<String, Integer> parseInt = Integer::parseInt;
		/**/
		
		/**/
		// �ν��Ͻ� �޼��� ���۷���
		List<String> list = Arrays.asList("apple", "banana", "orange");
		list.forEach(System.out::println);
		// ������ ���۷���(Constructor Reference): ������ ���ǵ� �����ڸ� ���ٽ����� ����� �� �ֽ��ϴ�.
		/**/
		
		/**/
		// ������ ���۷���
		Supplier<List<String>> listSupplier = ArrayList::new;
		/**/
		
		/**/
		/*
		 * 1. fruits ����Ʈ ����
		 * 2. ����Ʈ�� stream(���ٽ����� ó���� �� �ִ� �ݺ���)���� ��ȯ
		 * 3. filter �޼��带 ����� ���ϴ� ��Ҹ� �ɷ���
		 * 4. collect  �޼��带 ����Ͽ� ��Ʈ������ �ɷ��� ����Ʈ ����.
		 */
		List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
		List<String> result = fruits.stream().filter(fruit -> fruit.startsWith("a")).collect(Collectors.toList());
		result.forEach(System.out::println);
		/**/
	}
	
	// �Լ��� �������̽� Ȱ��: �ڹٿ����� �Լ��� �������̽��� ���� �����Ͽ� ���ٽ��� Ȱ���� �� �ֽ��ϴ�.
		@FunctionalInterface interface MyFunction{int operation(int a,int b);}

		// �Լ��� �������̽��� �̿��� ���ٽ� ���
		MyFunction add = (a, b) -> a + b;
}