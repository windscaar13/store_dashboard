package com.tesco.store_dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class StoreDashboardApplicationMain {

	
	//Swagger UI - http://localhost:8080/swagger-ui/index.html
	
	public static void main(String[] args) {
		SpringApplication.run(StoreDashboardApplicationMain.class, args);
	}

}
