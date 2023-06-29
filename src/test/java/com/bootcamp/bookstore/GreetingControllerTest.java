package com.bootcamp.bookstore;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GreetingControllerTest {
    @Test
    void shouldBeAbleToCreateGreetingController(){
        GreetingController greetingController = new GreetingController();
        String expectedGreeting = "Hello, World";
        String actualGreeting = greetingController.getGreeting();

        assertEquals(expectedGreeting, actualGreeting);
    }
}
