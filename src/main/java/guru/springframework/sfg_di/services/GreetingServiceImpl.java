package guru.springframework.sfg_di.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World!";
    }
}
