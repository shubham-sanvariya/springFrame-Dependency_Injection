package ronit.springFramework.springFrameDI.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ronit.services.ConstructorGreetingServices;

class ConstructorInjectedcontrollerTest {

    ConstructorInjectedcontroller controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedcontroller(new ConstructorGreetingServices());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}