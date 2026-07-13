package com.bptn.course._01_variables;

public class Variables {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};

		int secondElement = array[1]; // secondElement will be set equal to 2
		array[1] = 10;
		System.out.println("The second element of the array is: " + array[1]);
	}
}
