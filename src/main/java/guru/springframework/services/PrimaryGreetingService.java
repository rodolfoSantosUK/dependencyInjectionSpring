package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {


    @Override
    public String sayGreeting() {
        return "hello from the PRIMARY Bean";
    }
}
