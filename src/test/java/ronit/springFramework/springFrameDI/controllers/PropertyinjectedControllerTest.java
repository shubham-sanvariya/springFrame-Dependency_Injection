package ronit.springFramework.springFrameDI.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ronit.springFramework.springFrameDI.services.ConstructorGreetingServices;

class PropertyinjectedControllerTest {

    PropertyinjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyinjectedController();

        controller.greetingSerices = new ConstructorGreetingServices();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreetings());
    }
}