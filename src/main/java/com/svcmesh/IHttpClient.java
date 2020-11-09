package com.svcmesh;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
//@FeignClient( name="http-client", url="http://localhost:18001" )
@FeignClient( name="backend-provider" )	//url 대신에 eureka의 service id를 지정해도 
public interface IHttpClient {
	@GetMapping("/provider/{message}")
	@ApiOperation(value="Get Message of Provider")
	public String getMessage(@PathVariable String message);
}
