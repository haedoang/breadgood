package com.bside.breadgood;

import com.bside.breadgood.authentication.AuthRedirectUrisProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(AuthRedirectUrisProperties.class)
@SpringBootApplication
public class BreadgoodServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BreadgoodServerApplication.class, args);
    }

}
