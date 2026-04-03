package com.example;

/**
 * Simple string utility class.
 */
public class StringUtils {

    public String reverse(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }

    public boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        String cleaned = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        return cleaned.equals(reverse(cleaned));
    }

    public boolean isNullOrEmpty(String input) {
        return input == null || input.isEmpty();
    }
}
