package com.accenture.lkm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SleuthZipkinProducer {

    public static void main(String[] args) {
        SpringApplication.run(SleuthZipkinProducer.class, args);
    }

    @Bean
    public AlwaysSampler bean(){
    	return new AlwaysSampler();
    }
}