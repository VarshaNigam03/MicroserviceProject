package com.microproject.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class CloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigServerApplication.class, args);
	}

}


//registry - config server - api-gateway- services - dashboard - refresh eureka server
//adding zipkins(dowanload jar from https://zipkin.io/pages/quickstart.html) and sleuth
//java -jar zipkin-server-2.23.16-exec.jar