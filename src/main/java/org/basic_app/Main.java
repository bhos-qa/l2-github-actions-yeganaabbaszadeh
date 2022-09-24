package org.basic_app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(greeting("Alice"));
    }

    public static String greeting(String name) {
        return "Hello, " + name;
    }
}