package com.example;

/**
 * Main application entry point.
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello, Java Demo Project!");
        Calculator calc = new Calculator();
        System.out.println("2 + 3 = " + calc.add(2, 3));
        System.out.println("10 - 4 = " + calc.subtract(10, 4));
        System.out.println("3 * 5 = " + calc.multiply(3, 5));
        System.out.println("10 / 2 = " + calc.divide(10, 2));

        StringUtils utils = new StringUtils();
        System.out.println("Reverse of 'hello': " + utils.reverse("hello"));
        System.out.println("Is 'racecar' a palindrome: " + utils.isPalindrome("racecar"));
    }
}
