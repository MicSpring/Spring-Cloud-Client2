package com.subha.client2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.subha.client2.service.ClientService2;
import com.subha.client2.service.FeignClientService2;

@Controller
public class ClientController2 {
	
	@Autowired
	ClientService2 clientService2;
	
	@Autowired
	FeignClientService2 feignClient;
	
	@RequestMapping("/authDetails2")
	@ResponseBody
	public String authDetails()
	{
		String info = clientService2.getAuthInfo();
		return info;
	}
	
	
	@RequestMapping("/feignauthDetails2")
	@ResponseBody
	public String feignauthDetails2()
	{
		System.out.println("Feign Client is:"+feignClient);		
		return feignClient.getFeignAuthInfoUser("Mic-Puchu");
	}

}
