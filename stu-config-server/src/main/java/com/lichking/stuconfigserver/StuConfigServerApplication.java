package com.lichking.stuconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class StuConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StuConfigServerApplication.class, args);
	}
}
