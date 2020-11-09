package com.svcmesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class BackendServiceFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendServiceFeignApplication.class, args);
	}
	
}


