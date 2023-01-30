package ru.folder;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingControllerImpl implements GreetingController {

    private EurekaClient eurekaClient;

    @Autowired
    @Lazy
    public void setEurekaClient(EurekaClient eurekaClient) {
        this.eurekaClient = eurekaClient;
    }

    @Value("${spring.application.name}")
    private String appName;

    @Value("${userValue}")
    private String userName;

    @Override
    public String greeting() {
        return String.format("Hello from '%s'!", eurekaClient.getApplication(appName).getName());
    }

    @GetMapping("/abc")
    public void test() {
        System.out.println(userName);
    }

    @GetMapping("/abcd")
    public String abcd() {
        return "ABCD";
    }
}
