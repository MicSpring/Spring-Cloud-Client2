package com.subha.client2.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("AUTH-SERVICE")
public interface FeignClientService2 {
	
	@RequestMapping(value = "/authservice/login", method = RequestMethod.GET)
	public String getFeignAuthInfo();
	
	@RequestMapping(value = "/authservice/loginUser", method = RequestMethod.GET)
	public String getFeignAuthInfoUser(String user);

}
