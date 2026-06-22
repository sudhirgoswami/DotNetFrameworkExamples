package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
    @Test
    public void greetingIsCorrect() {
        assertEquals("Hello, Maven!", new App().getGreeting());
    }
}
