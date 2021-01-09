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
	
//	@Override
//	public void addCorsMappings(CorsRegistry registry) {
//		registry.addMapping("/**")		// 대상 url  ex) ~/api/ip
//        .allowedOrigins("*")			// 허용하는 localhost port
//        .allowedMethods("*");	// "GET", "POST"등 메소드 하용
//	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**")			///**
		.addResourceLocations("classpath:/templates/");		//classpath:/
				
//		System.out.print("registry : "+registry);
	}
}
