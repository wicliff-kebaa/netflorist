package com.bootcamp.NetFlorist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
public class NetFloristApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetFloristApplication.class, args);
	}
}
