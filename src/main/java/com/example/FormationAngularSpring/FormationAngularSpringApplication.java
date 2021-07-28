package com.example.FormationAngularSpring;

import filedemo.properties.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(FileStorageProperties.class)
public class FormationAngularSpringApplication {


	public static void main(String[] args) {
		SpringApplication.run(FormationAngularSpringApplication.class, args);
	}

}
