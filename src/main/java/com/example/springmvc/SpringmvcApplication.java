package com.example.springmvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@SpringBootApplication
public class SpringmvcApplication {

    private static Logger logger= LoggerFactory.getLogger(SpringmvcApplication.class);
    @Autowired
    private ApplicationContext applicationContext;
    public static void main(String[] args) {
        SpringApplication.run(SpringmvcApplication.class, args);
    }
    @Bean @Profile("dev")
    public CommandLineRunner run(){
        return args -> {
            logger.info("Welcome message Bush");
            logger.error("Sample Logger Message");
            logger.warn("Sample Logger Message");
            logger.info("Sample Logger Message");
            logger.trace("Sample Logger Message");
            logger.trace("Sample Logger Message");
            logger.debug("Sample Logger Message");
            Arrays.stream(this.applicationContext.getBeanDefinitionNames()).sorted().forEach(System.out::println);
        };
    }

}
