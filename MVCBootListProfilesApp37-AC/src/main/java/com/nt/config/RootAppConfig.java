package com.nt.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(value={PersistenceConfig.class,ServiceConfig.class,AOPConfig.class})
public class RootAppConfig {

	public static void main(String[] args) {
		SpringApplication.run(RootAppConfig.class, args);
	}
}
