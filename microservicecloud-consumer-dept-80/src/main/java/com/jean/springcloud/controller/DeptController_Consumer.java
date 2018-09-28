package com.jean.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.jean.springcloud.entities.Dept;

@RestController
public class DeptController_Consumer {
    
	
	/**
	 * 使用 使用restTemplate访问restful接口非常的简单粗暴无脑。
	 *  (url, requestMap,ResponseBean.class)这三个参数分别代表
	 *   REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
	 */
	//private static final String REST_URL_PREFIX="http://localhost:8001";
	private static final String REST_URL_PREFIX="http://MICROSERVICECLOUD-DEPT";//这是微服务名
	
    @Autowired
	private RestTemplate restTemplate;
    
    
    
                                                //http://localhost/consumer/dept/add?dname=管理部
    @RequestMapping(value="/consumer/dept/add") //客户端访问的是这个地址，实际上干活的是8001http:localhost:8001/dept/add
     public boolean add(Dept dept){
    	 
    	// return restTemplate.postForEntity(url, request, responseType)
    	 return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
     }
    
    
    @RequestMapping(value="/consumer/dept/get/{id}")  //http://localhost/consumer/dept/get/5
    public Dept get(@PathVariable("id") Long id){
   	 
   	 return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/"+id,Dept.class);
   	 
    }
    
    @SuppressWarnings("unchecked")
	@RequestMapping(value="/consumer/dept/list")   //http://localhost/consumer/dept/list
    public List<Dept> list(){
   	 
   	 return restTemplate.getForObject(REST_URL_PREFIX+ "/dept/list",List.class);
    }
    
    
 // 测试@EnableDiscoveryClient,消费端可以调用服务发现
 	@RequestMapping(value = "/consumer/dept/discovery")
 	public Object discovery()
 	{
 		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/discovery", Object.class);
 	}
  
}



