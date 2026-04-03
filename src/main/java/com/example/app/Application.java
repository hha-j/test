package com.example.app;

/**
 * Application entry point.
 */
public class Application {

    public static void main(String[] args) {
        GreetingService service = new GreetingService();
        System.out.println(service.greet("World"));
    }
}
