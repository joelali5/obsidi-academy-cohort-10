package com.bptn.course.day_06.MethodOverridingDemo;

public class MethodOverridingDemo {

    // Use the code below for Sanity check
    public static void main(String args[]) {
        Car car = new Car("White", "Audi", "ChromeColored");
        car.print();

        Bike bike = new Bike("Grey", "Bianchi", "SilverColored");
        bike.print();
    }
}