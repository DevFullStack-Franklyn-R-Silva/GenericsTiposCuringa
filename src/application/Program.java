package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<String> myStrings = Arrays.asList("Franklyn", "Deisy");
		List<Integer> myInts = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Double> myDouble = Arrays.asList(1.2, 2.3, 3.4, 4.5, 5.6, 6.7);
		print(myStrings);
		System.out.println();
		System.out.println("===============");
		print(myInts);
		System.out.println();
		System.out.println("===============");
		print(myDouble);
	}

	public static void print(List<?> list) {
		
		
//		for (Object object : list) {
//			System.out.print(", "+object );
//		}

		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
	}
}
