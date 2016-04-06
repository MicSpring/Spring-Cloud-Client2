package com.subha.client2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
//@EnableHystrix
@EnableCircuitBreaker
public class ClientStarter2 {
	
	public static void main(String[] args)
	{
		SpringApplication.run(ClientStarter2.class, args);
	}

}
