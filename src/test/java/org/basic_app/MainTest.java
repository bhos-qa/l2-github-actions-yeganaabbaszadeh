package org.basic_app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void checkGreetingTest() {
        String name = "Eren";
        assertEquals("Hello Eren", Main.greeting(name));
    }
}