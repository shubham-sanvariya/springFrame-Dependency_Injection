package ronit.springFramework.springFrameDI.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ronit.springFramework.springFrameDI.services.ConstructorGreetingServices;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingServices(new ConstructorGreetingServices());
    }

    @Test
    void getGreetings() {
        System.out.println(controller.getGreetings());
    }
}