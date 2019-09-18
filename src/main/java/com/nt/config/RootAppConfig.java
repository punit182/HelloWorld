package com.nt.config;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(value= {ServiceConfig.class})
public class RootAppConfig {

}

