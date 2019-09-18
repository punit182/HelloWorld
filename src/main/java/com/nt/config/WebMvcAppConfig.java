package com.nt.config;

import java.util.Properties;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.mvc.ParameterizableViewController;

@Configuration
@ComponentScan(basePackages="com.nt.controller")
public class WebMvcAppConfig {
	
	/*
	 * public HandlerMapping createSUHMapping() { SimpleUrlHandlerMapping suhm=null;
	 * Properties props=null; suhm=new SimpleUrlHandlerMapping();
	 * suhm.setOrder(Integer.MAX_VALUE); props=new Properties();
	 * props.setProperty("/home.htm", "pvc"); suhm.setMappings(props); return suhm;
	 * 
	 * } public Controller createPVController() {
	 * 
	 * 
	 * ParameterizableViewController pvc=null; pvc=new
	 * ParameterizableViewController(); pvc.setViewName("home"); return pvc; }
	 */
	
	
	
}