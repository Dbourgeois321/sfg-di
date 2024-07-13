package guru.springframework.sfg_di.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class myController {
    public String sayHello(){

        System.out.println("Hello World!");
        return "Hi Folks!";
    }
}
