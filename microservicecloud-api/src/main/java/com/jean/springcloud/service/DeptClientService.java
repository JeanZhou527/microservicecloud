package com.jean.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jean.springcloud.entities.Dept;



/**
 * 
 * @Description: 修改microservicecloud-api工程，根据已经有的DeptClientService接口
新建
一个实现了FallbackFactory接口的类DeptClientServiceFallbackFactory

客户端调用服务端出现问题，就去找FallbackFactory这个类，进行服务降级
 * @author zzyy
 * @date 2018年4月21日
 */
//@FeignClient(value = "MICROSERVICECLOUD-DEPT") 是做feign负载均衡
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory=DeptClientServiceFallbackFactory.class)//做feign，还带了服务降级
public interface DeptClientService
{
	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") long id);

	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> list();

	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public boolean add(Dept dept);
}