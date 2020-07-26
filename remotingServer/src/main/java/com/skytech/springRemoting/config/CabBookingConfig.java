
package com.skytech.springRemoting.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

import com.skytech.springRemoting.CabBookingService;
import com.skytech.springRemoting.service.CabBookingServiceImpl;
import com.skytech.springRemoting.web.HttpExporterFactory;

@Configuration
public class CabBookingConfig {

	@Bean(name = "booking")
	CabBookingService booking() {
		return new CabBookingServiceImpl();
	}

	@Bean(name = "/booking")
	HttpInvokerServiceExporter accountService(@Qualifier("booking") CabBookingService service) {
		return HttpExporterFactory.getExporter(service, CabBookingService.class);
	}
}
