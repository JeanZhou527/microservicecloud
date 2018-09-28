package com.jean.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;



@Configuration
public class ConfigBean {

	
	@LoadBalanced   //ribbon是基于客户端的负载均衡量工具
	@Bean
	public RestTemplate getRestTemplate(){
		
		return new RestTemplate();
	}
	
	@Bean
	public IRule myRule(){
		return new RandomRule();   //选择随机算法
	}
	
	
	
//	@Bean
//	public UserService  getUserService(){
//		
//		return new UserSercive;
//	}
	
}
