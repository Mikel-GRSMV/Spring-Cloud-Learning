package ru.folder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TestEurekaConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestEurekaConfigServerApplication.class);
    }
}
