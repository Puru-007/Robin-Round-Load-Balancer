package com.simpleLB.SimpleLinearLoadBalancer.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.simpleLB.SimpleLinearLoadBalancer.Impl.LoadBalancerLogicImpl;

@RestController
public class LBEndPoint {
	int count = 0;
	
	@GetMapping("/getUrlPort")
	public String balanceLoad() {
		LoadBalancerLogicImpl loadBalancerLogicImpl = new LoadBalancerLogicImpl();
		final String uri = loadBalancerLogicImpl.getUrl();
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		System.out.println(result);
		return result;
	}
}
