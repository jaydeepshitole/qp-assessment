package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.app","ex.demo"})
//def value of the component scan : name of the pkg containing spring boot main class

//@EntityScan(basePackages = {"pojos1","pojos2"})
public class SpringTestBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTestBootApplication.class, args);
	}

}
