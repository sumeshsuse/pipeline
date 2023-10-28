package com.example.pipelinedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class PipelinedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PipelinedemoApplication.class, args);
	}

}
