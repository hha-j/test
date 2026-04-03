package com.example.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingServiceTest {

    private final GreetingService service = new GreetingService();

    @Test
    void greetReturnsCorrectMessage() {
        assertEquals("Hello, World!", service.greet("World"));
    }

    @Test
    void greetWithDifferentName() {
        assertEquals("Hello, Java!", service.greet("Java"));
    }

    @Test
    void greetThrowsOnNullName() {
        assertThrows(IllegalArgumentException.class, () -> service.greet(null));
    }

    @Test
    void greetThrowsOnBlankName() {
        assertThrows(IllegalArgumentException.class, () -> service.greet("   "));
    }
}
