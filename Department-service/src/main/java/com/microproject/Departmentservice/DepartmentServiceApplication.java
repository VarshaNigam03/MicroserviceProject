package com.microproject.Departmentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}

//http://localhost:9191/departments/

//     {
//		"departmentId": 1,
//		"departmentName": "IT",
//		"departmentAddress": "3rd Cross,1st Street",
//		"departmentCode": "it-01"
//		}