package com.myweb.cloud_deployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CloudDeploymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudDeploymentApplication.class, args);
	}

	@GetMapping("/")
	public String home() {
		return "Welcome to the Cloud Deployment Application!";
	}

}
