package com.jean.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableCircuitBreaker//对容断器hystrix的支持
@EnableEurekaClient  //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient//本服务启动后会被eureka发现（服务发现）
@SpringBootApplication
//@ComponentScan(basePackages="com.jean.springcloud")
public class DeptProvider8001_Hystrix_App {

	public static void main(String[] args) {
		
		SpringApplication.run(DeptProvider8001_Hystrix_App.class, args);
	}

}
