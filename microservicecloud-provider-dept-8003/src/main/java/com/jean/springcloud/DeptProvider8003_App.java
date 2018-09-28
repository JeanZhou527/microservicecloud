package com.jean.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient  //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient//本服务启动后会被eureka发现（服务发现）
@SpringBootApplication
//@ComponentScan(basePackages="com.jean.springcloud")
public class DeptProvider8003_App {

	public static void main(String[] args) {
		
		SpringApplication.run(DeptProvider8003_App.class, args);
	}

}
