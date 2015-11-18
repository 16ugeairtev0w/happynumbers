package com.happynumbers;

public class Main {
    public static void main(String[] argv) {
        HappyNumbers happyNumbers = new HappyNumbers();
        happyNumbers.stream().forEach(System.out::println);
    }
}
