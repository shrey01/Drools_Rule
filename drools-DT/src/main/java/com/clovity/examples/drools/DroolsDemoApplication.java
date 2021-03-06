package com.clovity.examples.drools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.clovity.examples.drools.domain.Candidate;

@SpringBootApplication
public class DroolsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DroolsDemoApplication.class, args);
        System.out.println("Waiting for rest calls!!! ");
        }

}
