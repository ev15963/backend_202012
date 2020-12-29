package com.proj.backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{
	/**
	 * 크로스 도메인 이슈 해결
	 * 
	 * 
	 * 
	 * 
	 */
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowCredentials(true);
//        .allowedOrigins("http://localhost:3000/api/ip");
//        .allowedMethods("POST");
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**")			///static/**
		.addResourceLocations("classpath:/");		//classpath:/templates/
				
//		System.out.print("registry : "+registry);
	}
}
