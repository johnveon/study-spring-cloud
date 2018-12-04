package com.lichking.stucourseedgeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class StuCourseEdgeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StuCourseEdgeServiceApplication.class, args);
	}
}
