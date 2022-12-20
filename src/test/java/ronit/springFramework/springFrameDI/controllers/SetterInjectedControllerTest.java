package ronit.springFramework.springFrameDI.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ronit.springFramework.springFrameDI.services.GreetingSericesImpl;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingSerices(new GreetingSericesImpl());
    }

    @Test
    void getGreetings() {
        System.out.println(controller.getGreetings());
    }
}