package de.codecentric.rest.ribbon;

import de.codecentric.rest.api.Greeting;
import de.codecentric.rest.api.Input;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class Caller implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(Caller.class);

    @Autowired
    private Client client;

    @Override
    public void run(String... strings) throws Exception {
        Thread.sleep(1000);
        for(int i=0;i<1000;i++){
            callService();
        }
    }

    private void callService() {
        final ResponseEntity<Greeting> greetingResponseEntity = client.restTemplate().postForEntity("http://greeting-service/greeting", new Input("World"), Greeting.class);
        LOGGER.info(greetingResponseEntity.getStatusCode().toString());
        LOGGER.info(greetingResponseEntity.getBody().toString());
    }
}
