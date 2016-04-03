package com.subha.client2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;



@Service
public class ClientService2 {
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Value("${service.authserver.serviceID}")
	String authserviceID;
	
	
	public String getAuthInfo()
	{
		
		System.out.println("The Service ID----->"+authserviceID);
		List<ServiceInstance> serviceInstanceList = discoveryClient.getInstances(authserviceID);
		System.out.println(serviceInstanceList);
		
		for(ServiceInstance serviceInstance : serviceInstanceList)
		{
			System.out.println("----> "+serviceInstance);
		}
		
		return "Service Instances Created";
	}

}
