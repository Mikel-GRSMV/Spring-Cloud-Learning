package ru.folder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TestEurekaFeignClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestEurekaFeignClientApplication.class);
    }
}
