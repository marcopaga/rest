package de.codecentric.rest.server;


import de.codecentric.rest.api.Greeting;
import de.codecentric.rest.api.Input;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class GreetingRestController {


    @RequestMapping("/greeting")
    public Greeting greet(@RequestBody Input input){
        return new Greeting("Hello, " + input.getName());
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(GreetingRestController.class, args);
    }
}
