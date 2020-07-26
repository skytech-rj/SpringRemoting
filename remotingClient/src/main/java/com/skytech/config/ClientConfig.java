package com.skytech.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

import com.skytech.springRemoting.CabBookingService;

@Configuration
public class ClientConfig {
	@Value("${server.url}")
	String url;
	
	@Bean
	public HttpInvokerProxyFactoryBean invoker() {
		HttpInvokerProxyFactoryBean invoker = new HttpInvokerProxyFactoryBean();
		invoker.setServiceUrl(url);
		invoker.setServiceInterface(CabBookingService.class);
		return invoker;
	}

}
