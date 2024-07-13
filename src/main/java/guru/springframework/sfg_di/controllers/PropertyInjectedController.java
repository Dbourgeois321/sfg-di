package guru.springframework.sfg_di.controllers;

import guru.springframework.sfg_di.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){

        return greetingService.sayGreeting();
    }
}
