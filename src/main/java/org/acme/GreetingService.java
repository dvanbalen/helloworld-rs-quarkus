package org.acme;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {
        String createHelloMessage(String name) {
            return "Hello " + name + "!";
        }
    
}
