package guru.springframework.sfg_di.controllers;

import guru.springframework.sfg_di.services.GreetingService;

public class ConstructerInjectedController {

    private final GreetingService greetingService;

    public ConstructerInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
