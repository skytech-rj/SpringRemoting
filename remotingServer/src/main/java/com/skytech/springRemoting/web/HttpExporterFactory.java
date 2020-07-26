package com.skytech.springRemoting.web;

import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

public class HttpExporterFactory {
	public static HttpInvokerServiceExporter getExporter(Object service, Class<?> serviceInterface) {
		HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
		exporter.setService(service);
		exporter.setServiceInterface(serviceInterface);
		return exporter;
	}
}
