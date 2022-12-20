package ronit.springFramework.springFrameDI.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ronit.springFramework.springFrameDI.services.GreetingSericesImpl;

import static org.junit.jupiter.api.Assertions.*;

class PropertyinjectedControllerTest {

    PropertyinjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyinjectedController();

        controller.greetingSerices = new GreetingSericesImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreetings());
    }
}