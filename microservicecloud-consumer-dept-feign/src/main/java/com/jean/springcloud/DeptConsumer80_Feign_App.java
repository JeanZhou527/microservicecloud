package com.jean.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;






@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class DeptConsumer80_Feign_App {

   
	public static void main(String[] args) {
		
        SpringApplication.run(DeptConsumer80_Feign_App.class, args);
	}

}
