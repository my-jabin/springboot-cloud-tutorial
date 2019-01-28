package com.jiujiu.springboot.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer

public class ConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
	}


	// in the spring.cloud.config.server.git.uri=file://${user.home}/application-config we init a git repository
	// for one client named "discovery", we created a "discovery.properties" file. this is the configuration for client project "discovery"
	// we can access the properties under this link
	// http://localhost:8081/discovery/master
	// Reference : https://www.baeldung.com/spring-cloud-configuration
}

