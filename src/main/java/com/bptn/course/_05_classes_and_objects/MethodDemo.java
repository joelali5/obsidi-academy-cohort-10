package com.bptn.course._05_classes_and_objects;
import java.util.Scanner;

class Calculation {
	int num1;
	int num2;
	
	Calculation(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int addNumbers() {
        int sum = num1 + num2;
        return sum;
    }
}

public class MethodDemo {
	
	public static void main(String[] args) {
		int a, b;
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		Calculation calc = new Calculation(a,b);
        int result = calc.addNumbers();
        System.out.println("Result: " + result);
        scanner.close();
    }

    
}
