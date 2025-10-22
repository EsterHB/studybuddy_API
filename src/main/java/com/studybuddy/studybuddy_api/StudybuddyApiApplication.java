package com.studybuddy.studybuddy_api;

import jakarta.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudybuddyApiApplication {
    @Value("${spring.datasource.url}")
    private String dbUrl;

	public static void main(String[] args) {
		SpringApplication.run(StudybuddyApiApplication.class, args);
	}

    @PostConstruct
    public void logDatabaseUrl() {
        System.out.println("🔍 URL do banco carregada: " + dbUrl);
    }

}
