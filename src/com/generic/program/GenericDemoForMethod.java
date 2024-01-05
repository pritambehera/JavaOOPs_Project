package com.generic.program;

public class GenericDemoForMethod {
	public static <E> void printArray(E[] elements) {
		for (E element : elements) {
			System.out.println(element);
		}

	}

	public static void main(String[] args) {
		Integer[] intArray = { 10, 11, 12, 14, 15, 16 };
		Character[] charArray = { 'J', 'A', 'V', 'A' };

		System.out.println("integer array");
		printArray(intArray);

		System.out.println("char array");
		printArray(charArray);
	}
}
