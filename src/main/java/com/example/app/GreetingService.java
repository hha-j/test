package com.example.app;

/**
 * Service providing greeting messages.
 */
public class GreetingService {

    /**
     * Returns a greeting for the given name.
     *
     * @param name the name to greet
     * @return greeting string
     */
    public String greet(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be blank");
        }
        return "Hello, " + name + "!";
    }
}
