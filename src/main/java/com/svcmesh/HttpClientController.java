package com.svcmesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

//feign client의 결과값을 추가 가공하는 방법 예제 

@RestController
public class HttpClientController {
	@Value("${server.port}")
	private String port;
	
	@Autowired
	IHttpClient httpClient;
	
	@GetMapping("/message/{message}")
	@ApiOperation(value="Get Message of Provider")
	public String getMessage(@PathVariable String message) {
		return "["+port+"] => " + httpClient.getMessage(message);
	}
}
