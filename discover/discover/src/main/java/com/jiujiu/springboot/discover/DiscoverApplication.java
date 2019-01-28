package com.jiujiu.springboot.discover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoverApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoverApplication.class, args);
	}

	//  this is a config-client application. Config-server is the application "config"
	//  this is also a service registry (Eureka Server),

	//  we need a way for all of our servers to be able to find and communicate with each other without hard coding hostname and port.
	//  Since our applications could be running on any ip/port combination we need a central address registry that can serve as an application address lookup.
	//	When a new server is provisioned it will communicate with the discovery server and register its address so that others can communicate with it.



	//	Reference: https://www.baeldung.com/spring-cloud-netflix-eureka
}

