package org.example.claiminsured;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ClaiminsuredApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClaiminsuredApplication.class, args);
    }

}
